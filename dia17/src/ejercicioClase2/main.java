
package ejercicioClase2;

public class main {

    public static void main(String[] args) {
        Counter c = new Counter();
        c.start();
        Counter co = new Counter();
        co.start();
        System.out.println(c.value());
        System.out.println(co.value());
    }
    
}
