
package ejercicioClase3;


public class main {

    public static void main(String[] args) {
        PingPongSincronizado p1 = new PingPongSincronizado("h");
        p1.start();
        PingPongSincronizado p2 = new PingPongSincronizado("o");
        p2.start();
    }
    
}
