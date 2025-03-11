
package ejercicio2;

public class main {
    public static void main(String[] args) {
        threadUno suma = new threadUno(1,3);
        suma.start();
        
        threadDos nombre = new threadDos("luis","caicedo");
        nombre.start();
        System.out.println(suma.getState().name());
        System.out.println(suma.getState());
    }
    
}
