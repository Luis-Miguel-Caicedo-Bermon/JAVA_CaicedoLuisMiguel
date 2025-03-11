
package dia17;

public class Dia17 {

    public static void main(String[] args) {
        hiloUno h1 = new hiloUno();
        h1.start(); 
        System.out.println(h1.getState().name());
        
        System.out.println("hola");
        
        Thread h2 = new Thread(new hiloDos());
        h2.start();
    }
}
