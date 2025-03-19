package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.UsuarioVista;

import java.util.Scanner;

public class UsuarioControlador {
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioVista usuarioVista, UsuarioDAO usuarioDAO) {
        this.usuarioVista = usuarioVista;
        this.usuarioDAO = usuarioDAO;
        this.scanner = scanner = new Scanner(System.in);
    }

    public void iniciar(){
        boolean bucle = true;
        while (bucle == true){
            System.out.println("""
                    Menu principal
                    1. Crear usuario.
                    2. Listar usuarios.
                    3. Actualizar usuario.
                    4. Eliminar usuario.
                    5. Buscar usuario por id.
                    6. Salir.
                    :""");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.agregar(nuevoUsuario);
                    System.out.println("Usuario agregado");
                    break;
                case 2:
                    usuarioVista.mostrarUsuario(usuarioDAO.obtenerUsuarios());
                    break;
                case 3:
                    usuarioDAO.actualizar(usuarioVista.actualizarUsuario());
                    break;
                case 4:
                    usuarioDAO.eliminar(usuarioVista.eliminarUsuario());
                    break;
                case 5:
                    usuarioDAO.buscarUsuarios(usuarioVista.buscarPorId());
                    break;
                case 6:
                    bucle = false;
            }
        }
    }
}
