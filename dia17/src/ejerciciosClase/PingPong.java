
package ejerciciosClase;

public class PingPong extends Thread{
    private String word;
    public PingPong(String s){word=s;}

    @Override
    public void run() {
        for (int i=0;i<3000;i++){
            System.out.println(word);
        }
    }
}
