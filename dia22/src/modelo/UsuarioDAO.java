package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    Conexion conexion = new Conexion();
    
    public List<Usuario> obtenerUsuarios(){
        String sql = "select * from usuarios";
        List<Usuario> listaUsuarios = new ArrayList<>();
        try{
            Connection conexionInterna = conexion.conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()){
                
                Usuario u = new Usuario(resultado.getInt("id"),resultado.getString("nombre"),resultado.getString("email"));
                listaUsuarios.add(u);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    
    public int agregar(Usuario u){
        String sql = "insert into usuarios (nombre,email) values (?,?)";
        try{
            Connection conexionInterna = conexion.conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setString(1,u.getNombre());
            solicitud.setString(2,u.getCorreo());

            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera correcta");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }
    
    public int actualizar(Usuario u){
        String sql = "update usuarios set nombre=?, email=? where id= ?";
        int filas = 0;
        try{
            Connection conexionInterna = conexion.conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setString(1,u.getNombre());
            solicitud.setString(2,u.getCorreo());
            solicitud.setInt(3,u.getId());

            filas = solicitud.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filas;
    }
    
     public int eliminar(Usuario u){
        String sql = "delete from usuarios where id=?";
        int filas = 0;
        try {
            Connection conexionInterna = conexion.conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setInt(1,u.getId());

            filas = solicitud.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filas;
    }
}
