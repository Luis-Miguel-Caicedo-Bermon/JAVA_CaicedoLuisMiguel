
package ejercicio2;

public class threadUno extends Thread {
    int numero1;
    int numero2;

    public threadUno(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @Override
    public void run() {
        System.out.println(numero1+numero2);
    }
    
}
