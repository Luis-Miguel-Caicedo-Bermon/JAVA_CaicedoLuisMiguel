package vista;

import modelo.Usuario;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

// la vista maneja la interaccion con el usuario
public class UsuarioVista {
    public void mostrarUsuario(List<Usuario> usuarios){
        System.out.println("lista de usuarios");
        for(Usuario u : usuarios){
            System.out.println(u);
        }
    }

    public Usuario agregarUsuario(){
        System.out.println("Datos para el nuevo usuario");
        System.out.println("Nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        return new Usuario(nombre,email);
    }

    public Usuario actualizarUsuario(){
        System.out.println("ID del usuario a actualizar");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nuevo email");
        String email = sc.nextLine();
        return new Usuario(id,nombre,email);
    }

    public Usuario eliminarUsuario(){
        System.out.println("ID del usuario a actualizar");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        return new Usuario(id);
    }

    public Usuario buscarPorId(){
        System.out.println("ID del usuario a buscar");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        return new Usuario(id);
    }
}
