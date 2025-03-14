package CRUD;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

}
