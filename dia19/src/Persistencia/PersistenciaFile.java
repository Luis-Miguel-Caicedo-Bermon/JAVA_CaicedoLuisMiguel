package Persistencia;

import java.io.*;

public class PersistenciaFile {
    private static final String nombre_archivo = "./src/Persistencia/data.txt";

    public static void guardarDatos(String contenido){
        try(FileWriter guardar = new FileWriter(nombre_archivo)){
            guardar.write(contenido);
            System.out.println("Datos fueron guardados de manera correcta");
        }
        catch (IOException e){
            System.out.println("Error al momento de guardar: "+e.getMessage());
        }
    }
    public static void leerDatos(){
        try(BufferedReader lector = new BufferedReader(new FileReader(nombre_archivo))){
            String linea;
            System.out.println("Contenido del archivo");
            while ((linea = lector.readLine()) !=null){
                System.out.println(linea);
            }
        }
        catch (IOException e){
            System.out.printf("Error al momento de importar el archivo: "+e.getMessage());
        }
    }
}