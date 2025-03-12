
package ejercicioClase2;


public class Counter extends Thread {
    private int c =0;
    public void increment(){
        c++;
    }
    public void decrement(){
        c--;
    }
    public void run (){
        for (int i = 0; i<1000000000;i++){
            increment();
            decrement();
        }
    }
    public int value(){
        return c;
    }
}
