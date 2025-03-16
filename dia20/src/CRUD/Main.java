
package CRUD;
import java.util.Scanner;

import static CRUD.Crudtxt.*;

public class Main {

    public static void main(String[] args) {
//        cargarDatos();
//        listarPersonas();
//        listarProductos();

        Scanner scan = new Scanner(System.in);

        boolean bucle = true;
        while (bucle == true){
            cargarDatos();
            System.out.println("""
                    ------MENU-----
                    1. Leer
                    2. Actualizar
                    3. Agregar
                    4. Eliminar
                    5. Salir
                    """);
            String opc = scan.nextLine();
            switch (opc){
                case "1":
                    listarProductos();
                    break;
                case "2":
                    System.out.println("id del producto que va a actualizar");
                    int id_actualizar = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Nuevo nombre del producto");
                    String nombre_actualizar = scan.nextLine();
                    System.out.println("Nuevo precio del producto");
                    double precio_actualizar = scan.nextDouble();
                    scan.nextLine();
                    try {
                        actualizarProductos(id_actualizar,nombre_actualizar,precio_actualizar);
                    }
                    catch (Exception e){
                        System.out.println("Hubo un  error, no se pudo actualizar");
                    }
                    break;
                case "3":
                    System.out.println("id del producto");
                    int idNuevoProducto = scan.nextInt();
                    scan.nextLine();
                    System.out.println("nombre del producto");
                    String nombreNuevoProducto = scan.nextLine();
                    System.out.println("precio del producto");
                    double precioNuevoProducto = scan.nextDouble();
                    scan.nextLine();
                    agregarProducto(idNuevoProducto,nombreNuevoProducto,precioNuevoProducto);
                    break;
                case "4":
                    System.out.println("id del producto que vas a eliminar");
                    int idEliminar = scan.nextInt();
                    scan.nextLine();
                    eliminarProducto(idEliminar);
                    break;
                case "5":
                    bucle=false;
                    break;
                default:
                    System.out.println("opción no valida");
                    break;
            }
            System.out.println("Enter para continuar");
            scan.nextLine();
        }
    }
    
}
