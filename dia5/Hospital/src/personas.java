
public class personas {
    int id;
    String nombre;
    String apellidos;
    String fecha_nacimiento;
    String direccion;
    String fecha_ingreso;
    String titulo;

    public personas(int id, String nombre, String apellidos, String fecha_nacimiento, String direccion, String fecha_ingreso, String titulo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
        this.fecha_ingreso = fecha_ingreso;
        this.titulo = titulo;
    }
    
    public void mostrar(){
        System.out.println("Id: "+id+"  Nombres: "+nombre+"  apellidos: "+apellidos+"  fecha de nacimiento: "+fecha_nacimiento
        +"  direción: "+direccion+"  fecha de ingreso: "+fecha_ingreso+"  Titulo: "+titulo);
    }
}
