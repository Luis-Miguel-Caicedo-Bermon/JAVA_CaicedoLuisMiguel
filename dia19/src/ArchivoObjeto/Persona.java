package ArchivoObjeto;

import java.io.*;

public class Persona {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return id + "\n" + nombre + "\n" + edad;
    }

    public static Persona fromString(String data) {
        String[] parts = data.split(",");
        return new Persona(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("./src/ArchivoObjeto/persona.txt"));
        Persona persona1 = new Persona();

        persona1=fromString(lector.readLine());
        System.out.println(persona1);
    }
}
