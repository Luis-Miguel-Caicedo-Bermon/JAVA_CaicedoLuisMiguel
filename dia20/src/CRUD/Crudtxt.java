package CRUD;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Crudtxt {
    private static String archivo = "./src/CRUD/data.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();

    public static void cargarDatos (){
        personas.clear();
        productos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea= reader.readLine())!=null){
                if (linea.startsWith("P,")){
                    personas.add(Persona.fromString(linea));
                }
                else if (linea.startsWith("PR,")){
                    productos.add(Producto.fromString(linea));
                }
            }
        }
        catch (Exception e) {
            System.out.println("No se puede cargar el archivo. Se procede a crear uno nuevo");
        }
    }

    public static void guardarDatos() {
        try(FileWriter guardar = new FileWriter(archivo)){
            String texto = "";
            for (Producto p : productos){
                texto+=p.toString()+"\n";
            }
            for (Persona p : personas){
                texto+=p.toString()+"\n";
            }

            guardar.write(texto);
        } catch (Exception e) {
            System.out.println("No se pudo guardar el archivo");
        }
    }

    public static void listarPersonas(){
        if (personas.isEmpty()){
            System.out.println("No se puede listar las personas porque no hay");
        }
        else {
            for (Persona p : personas){
                System.out.println(p);
            }
        }
    }
    public static void listarProductos(){
        if (productos.isEmpty()){
            System.out.println("No se puede listar las productos porque no hay");
        }
        else {
            for (Producto p : productos){
                System.out.println(p);
            }
        }
    }

    public static void actualizarProductos(int id_producto,String nuevo_nombre,double nuevo_precio){
        for (Producto p : productos){
            if (p.getId()==id_producto){
                p.setNombre(nuevo_nombre);
                p.setPrecio(nuevo_precio);
            }
        }
        guardarDatos();
    }

    public static void agregarProducto(int id,String nombre,double precio){
        Producto nuevoProducto = new Producto(id, nombre, precio);
        productos.add(nuevoProducto);
        guardarDatos();
    }

    public static void eliminarProducto(int idProducto){
        for (Producto p : productos){
            if (p.getId()==idProducto){
                productos.remove(p);
                break;
            }
        }
        guardarDatos();
    }
}
