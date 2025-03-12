
package ejercicioClase3;

public class PingPongSincronizado extends Thread{
    private String word;

    public PingPongSincronizado(String s) {
        word = s;
    }

    @Override
    public void run() {
        synchronized (getClass()){
            for(int i = 0;i<3000;i++){
                System.out.println(word);
                System.out.flush();
                getClass().notifyAll();
                try{
                    getClass().wait();
                }catch(InterruptedException e){}
                getClass().notifyAll();
            }
        }
    }
    
}
