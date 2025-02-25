

public class main {

    public static void main(String[] args) {
        
        // ejercicio 1
        Empleado e1 = new Empleado(1,"Luis",1000);
        e1.setSalario(2000);
        System.out.println(e1.getSalario());
        System.out.println(e1.mostrarInformacion());
        e1.setNombre("Miguel");
        System.out.println(e1.getnombre());
        System.out.println(e1.getId());
        
        
        
        
    }
    
}
