import controlador.UsuarioControlador;
import modelo.UsuarioDAO;
import vista.UsuarioVista;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioVista usuarioVista = new UsuarioVista();
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioVista,usuarioDAO);

        usuarioControlador.iniciar();
    }
}