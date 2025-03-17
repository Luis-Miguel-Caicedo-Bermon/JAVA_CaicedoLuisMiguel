package normalito;

import java.util.List;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

//        usuarioDAO.insertUsuario("luis","luis@gmail.com");
        List<String> listausuarios = usuarioDAO.obtenerUsuarios();
        for (String u: listausuarios){
            System.out.println(u);
        }

//        usuarioDAO.actualiazarUsuario(2,"Yerxon","yerxonconx@gmail.com");
//        usuarioDAO.eliminarUsuarios(1);
        System.out.println(usuarioDAO.buscarUsuarios(2));
        listausuarios = usuarioDAO.obtenerUsuarios();
        for (String u: listausuarios){
            System.out.println(u);
        }
    }
}
