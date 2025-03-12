
package dia18;

import java.util.logging.Level;
import java.util.logging.Logger;

public class carrera extends Thread  {
    String testigo = "testigo";
    String atleta;
    int tiempo = (int) (Math.random()*3+9);

    public carrera(String atleta) {
        this.atleta = atleta;
    }
    
    public void correr(){
        System.out.println(atleta+" corriendo");
    }
    
    public void recibir(){
        System.out.println(atleta+" recibe el "+testigo);
    }
    public void entrega(){
        System.out.println(atleta+" entrega el "+testigo);
    }

    @Override
    public void run() {
        synchronized (getClass()){
            recibir();
            for (int i = 0; i < tiempo; i++)  {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {}
                correr();
            }
            entrega();
        }
    }
    
    
}
