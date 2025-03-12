
package ejerciciosClase;

public class main {

    public static void main(String[] args) {
        
        Thread t1 = new PingPong("s");
        Thread t2 = new PingPong("p");
        t1.start();
        t2.start();
    }
    
}
