import java.util.ArrayList;
import java.util.Scanner;

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
    public void actualizarStock(int cantidad){
        if (cantidad+this.cantidad>=0) {
            this.cantidad+=cantidad;
        }
        else{
            System.out.println("cantidad no valida");
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Producto> lista_producto = new ArrayList<>();
        lista_producto.add(new Producto("1234","Celular",12,1000));
        lista_producto.add(new Producto("5678","Mouse",7,100));
        lista_producto.add(new Producto("9101","Teclado",11, 120));

        System.out.println("");
        for (Producto p : lista_producto) {System.out.println(p.toString());}
        System.out.println("");

        System.out.println("cambiar codigo del primer producto");
        lista_producto.get(0).setCodigo("1111");
        for (Producto p : lista_producto) {System.out.println(p.toString());}
        System.out.println("");

        
        System.out.println("cambiar el nombre del segundo producto");
        lista_producto.get(1).setNombre("audifonos");
        for (Producto p : lista_producto) {System.out.println(p.toString());}
        System.out.println("");

        System.out.println("agregar teclados ");
        lista_producto.get(2).actualizarStock(5);
        for (Producto p : lista_producto) {System.out.println(p.toString());}
        System.out.println("");

        System.out.println("restar cantidad invalida de celulares");
        lista_producto.get(0).actualizarStock(-15);
        for (Producto p : lista_producto) {System.out.println(p.toString());}
        System.out.println("");

        
        System.out.println("cambiar precio de teclado");
        lista_producto.get(2).setPrecio(150);
        for (Producto p : lista_producto) {System.out.println(p.toString());}
        System.out.println("");
    }
}
