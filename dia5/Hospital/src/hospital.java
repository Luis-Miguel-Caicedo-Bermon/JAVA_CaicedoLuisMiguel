
public class hospital {
    int id;
    String nombre;

    public hospital(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrar(){
        System.out.println("Id: "+id+"  Nombre: "+nombre);
    }
}
