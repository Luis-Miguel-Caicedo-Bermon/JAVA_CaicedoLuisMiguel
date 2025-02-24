
public class Empleado {
    private int id;
    private String nombre;
    private double salario;

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void setSalario(double salario){
        if (salario>=0) {
            this.salario = salario;
        }
        else{
            System.out.println("El salario no puede ser negativo");
        }
    }
    public double getSalario(){
        return salario;
    }
    public String mostrarInformacion(){
        return "id: "+id+"  Nombre: "+nombre+"  Salario: "+salario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public int getId(){
        return id;
    }
    
}
