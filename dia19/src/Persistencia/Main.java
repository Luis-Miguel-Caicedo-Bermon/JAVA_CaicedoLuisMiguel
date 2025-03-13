package Persistencia;

public class Main {
    public static void main(String[] args) {
        PersistenciaFile.guardarDatos("Hola soy un mensaje");
        PersistenciaFile.leerDatos();
    }
}