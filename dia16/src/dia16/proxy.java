/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia16;
//actúa como un intermediario o sustituto de otro objeto para controlar el acceso a éste.
//Proporciona una representación o proxy de otro objeto y controla el acceso a él.
//Esto puede ser útil en situaciones en las que se quiere agregar funcionalidad
//adicional al objeto original sin modificar su código.
public class proxy {
    public interface Sujeto { 
        void operacion(); 
    }   

    // Clase SujetoReal 
    static class SujetoReal implements Sujeto { 

        @Override 
        public void operacion() { 
            System.out.println("Realizando la operación en el sujeto real."); 
        } 
    }
    // Clase ProxySujeto 
    public static class ProxySujeto implements Sujeto { 
        private SujetoReal sujetoReal;   

        @Override 
        public void operacion() { 
            if(sujetoReal == null){ 
                sujetoReal = new SujetoReal(); 
            }          

            System.out.println("Registrando la llamada al método operacion() del Proxy.");  
            sujetoReal.operacion(); 
        } 
    }
    public static void main(String[] args) {
        Sujeto sujeto = new ProxySujeto(); 
        sujeto.operacion();
    }
}
