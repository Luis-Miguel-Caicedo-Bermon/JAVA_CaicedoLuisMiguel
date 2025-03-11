
package ejercicio2;

public class threadDos extends Thread {
    String nombre;
    String apellido;

    public threadDos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    @Override
    public void run() {
        System.out.println(nombre +" "+ apellido);
    }
    
}
