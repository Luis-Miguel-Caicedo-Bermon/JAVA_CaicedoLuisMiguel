
public class Producto {
    
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCantidad(int cantidad){
        if (cantidad>=0) {
            this.cantidad = cantidad;
        }
        else{
            System.out.println("La cantidad no pueda ser negativa.");
        }
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setPrecio(double precio){
        if (precio>0) {
            this.precio = precio;
        }
        else{
            System.out.println("el precio no puede ser negativo ni 0");
        }
    }
    public double getPrecio(){
        return precio;
    }
}
