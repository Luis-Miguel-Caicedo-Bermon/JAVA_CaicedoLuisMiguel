import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

//    //funciones lambda
//    son funciones o metodos en java que se representaran de manera anonima
//    pues se definen en la linea donde se van a utilizar
//    dichas funciones pueden recibir cero o mas argumentos y devolver
//    uno o ningun valor de retorno.


//        sintaxis
//        (parametros) -> {cuerpo de la foncion}
//        Parámetros: Son los valores de entrada de la función. Operador ->: Separa los parámetros de la implementación. Cuerpo de la función: Es el código que se ejecutará.
//        Las expresiones lambda solo funcionan con interfaces funcionales, es decir, interfaces que tienen un único método abstracto. Algunas interfaces funcionales predefinidas en java.util.function incluyen:
//        Function<T, R> -> Recibe un argumento y devuelve un resultado.
//        Consumer<T> -> Recibe un argumento y no devuelve nada.
//        Supplier<T> -> No recibe argumentos, pero devuelve un resultado.
//        Predicate<T> -> Recibe un argumento y devuelve true o false.
//        Consumer es una interfaz funcional que representa una operación que acepta un solo argumento de entrada y no devuelve ningún resultado. La interfaz Consumer se utiliza comúnmente para realizar acciones o efectos secundarios sobre un objeto, como imprimirlo en la consola, agregarlo a una colección, o cualquier otra operación que no requiera devolver un valor.

        Consumer<String>consumidor = Saludo ->{
            String lenguaje = "Java";

            System.out.println(Saludo + " Bienvenid@ a "+ lenguaje + "!");
        };
        consumidor.accept("Pepe");

        // Creación de un BiConsumer<String, String> usando una expresión lambda
        BiConsumer<String, String> consumidors = (nombre, saludo) -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo, nombre y una cadena adicional
            System.out.println(saludo + " " + nombre + " Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del BiConsumer con dos argumentos "Pepe" y "Hola"
        consumidors.accept("Pepe", "Hola");



        /*/
        La interfaz funcional Supplier<T> pertenece al paquete java.util.function y se utiliza para representar un proveedor de resultados.
        Esta interfaz no toma ningún argumento y produce un resultado de tipo T.
        Es decir, se utiliza cuando se necesita generar o proporcionar un valor,
        pero no se tiene ningún argumento para hacerlo. Se puede pensar en ello como una fábrica
        que suministra datos.
         */

        // Supplier que suministra un número aleatorio entre 1 y 100
        Supplier<Integer> generadorAleatorio = () -> new Random().nextInt(100) + 1;

        // Obtener el resultado del Supplier
        int numeroAleatorio = generadorAleatorio.get();

        System.out.println("Número aleatorio: " + numeroAleatorio);



        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };

        String mensaje = "holissss";
        int longitud = sizeOf.apply(mensaje);
        System.out.println("Longitud del mensaje: "+longitud);




        Predicate<Integer> esPar = num -> num % 2 == 0;

        System.out.println("4 es par? : "+esPar.test(4));
        System.out.println("7 es par? : "+esPar.test(7));
    }

}