package normalito;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private String URL = "jdbc:mysql://ut6zxc7npmqytnzl:VHrH6k8ewoShhYaU2X0S@b6yfgv5kwlvo5jgdh21f-mysql.services.clever-cloud.com:3306/b6yfgv5kwlvo5jgdh21f";
    private String USUARIO = "ut6zxc7npmqytnzl";
    private String PASSWORD = "VHrH6k8ewoShhYaU2X0S";

    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }

    // crear insert
    public void insertUsuario(String nombre,String email){
        String sql = "insert into usuarios (nombre,email) values (?,?)";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setString(1,nombre);
            solicitud.setString(2,email);

            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera correcta");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // leer select

    public List<String> obtenerUsuarios(){
        String sql = "select * from usuarios";
        List<String> listaUsuarios = new ArrayList<>();
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()){
                listaUsuarios.add(resultado.getInt("id")+
                        " - "+resultado.getString("nombre")+" - "+
                        resultado.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    // actualizar

    public  void actualiazarUsuario(int id,String nombre,String email){
        String sql = "update usuarios set nombre=?, email=? where id= ?";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setString(1,nombre);
            solicitud.setString(2,email);
            solicitud.setInt(3,id);

            int filas = solicitud.executeUpdate();
            if (filas > 0){
                System.out.println("Usuario actualizado exitosamente");
            }
            else {
                System.out.println("No se pudo actualizar el usuario co el id "+id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
