
public class pabellon {
    int id;
    int id_hospital;
    String nombre;
    int capacidad;

    public pabellon(int id, int id_hospital, String nombre, int capacidad) {
        this.id = id;
        this.id_hospital = id_hospital;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    
    public void mostrar(){
        System.out.println("Id: "+id+"  id hospital: "+id_hospital+"  nombre: "+nombre+"  capacidad: "+capacidad);
    }

}
