package normalito;

import java.util.List;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //usuarioDAO.insertUsuario("luis","luis@gmail.com");
        List<String> listausuarios = usuarioDAO.obtenerUsuarios();
        for (String u: listausuarios){
            System.out.println(u);
        }

        usuarioDAO.actualiazarUsuario(1,"Yerxon","yerxonconx@gmail.com");

        listausuarios = usuarioDAO.obtenerUsuarios();
        for (String u: listausuarios){
            System.out.println(u);
        }
    }
}
