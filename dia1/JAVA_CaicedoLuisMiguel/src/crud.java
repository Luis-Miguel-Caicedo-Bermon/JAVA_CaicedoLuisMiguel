
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class crud {
    
    static void menu (){
        System.out.println("Bienvenido a la tienda de frutas");
        System.out.println("1. ver frutas disponibles");
        System.out.println("2. agregar frutas");
        System.out.println("3. actualizar cantidad de frutas");
        System.out.println("4. eliminar frutas");
        System.out.println("5. salir del programa");
    }
    
    static void inventario(ArrayList<String> frutas , ArrayList<Number> precio , ArrayList<Number> stock){
        System.out.println("Lista de frutas");
        for (int i = 0; i < frutas.size(); i++){
            System.out.println(i+1+".  fruta : " + frutas.get(i)+"    precio : " + precio.get(i) + "     Stock : " + stock.get(i));
        }
    }
    
    public static void main(String[] args) {
        
        
        ArrayList<String> frutas = new ArrayList<>();
        ArrayList<Number> precio = new ArrayList<>();
        ArrayList<Number> stock = new ArrayList<>();
        
        frutas.addAll(Arrays.asList("manzana","pera","piña","papaya","melon"));
        precio.addAll(Arrays.asList(3000,2000,7000,10000,6000));
        stock.addAll(Arrays.asList(15,20,17,12,6));
        
        boolean bucle = true;
        while (bucle == true) {            
            
            Scanner teclado = new Scanner(System.in);   
            menu();
            String opcion = teclado.nextLine();
            
            switch (opcion) {
                case "1":
                    inventario(frutas,precio,stock);
                    System.out.println("");
                    System.out.println("Preciona enter para volver al menú");
                    opcion = teclado.nextLine();
                break;
                
                case "2":
                    System.out.println("nombre de la nueva fruta");
                    String nombre_fruta = teclado.nextLine();
                    System.out.println("precio de la fruta");
                    float precio_fruta = teclado.nextFloat();
                    System.out.println("cantidad de fruta");
                    int cantidad_fruta = teclado.nextInt();
                    
                    frutas.add(nombre_fruta);
                    precio.add(precio_fruta);
                    stock.add(cantidad_fruta);
                    
                    System.out.println("fruta agregada con exito");
                break;
                
                case "3":
                    inventario(frutas,precio,stock);
                    System.out.println("Ingresa el numero de la fruta que deseas actualizar");
                    int seleccion = teclado.nextInt();
                    seleccion = seleccion - 1;
                    if (seleccion < frutas.size() && seleccion >= 0){
                        System.out.println("Ingresa la nueva cantidad en stock de " + frutas.get(seleccion));
                        int nuevo_stock = teclado.nextInt();
                        stock.set(seleccion,nuevo_stock);
                    }
                    else
                        System.out.println("seleccion invalida");
                    
                break;
                
                case "4":
                    inventario(frutas,precio,stock);
                    System.out.println("Ingresa el numero de la fruta que deseas eliminar");
                    int seleccion_eliminar = teclado.nextInt();
                    seleccion_eliminar = seleccion_eliminar - 1;
                    if (seleccion_eliminar < frutas.size() && seleccion_eliminar >= 0){
                        frutas.remove(seleccion_eliminar);
                    }
                    else
                        System.out.println("seleccion invalida");
                break;
                
                case "5":
                    bucle = false;
                break;
                
                default:
                    System.out.println("opción no valida");
            
                    
            }
            
        }
        
    }
    
}
