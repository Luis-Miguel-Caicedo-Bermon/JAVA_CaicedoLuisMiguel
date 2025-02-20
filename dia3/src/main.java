
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class main {
    
    static void menu(){
        System.out.println("""
        1. Escribe un programa para imprimir todos los números naturales del 1 al n.
        2. Escribe un programa para imprimir todos los números naturales en orden inverso.
        3. Escribe un programa para imprimir tablas de multiplicar.
        4. Escribe un programa para imprimir tablas de multiplicar en orden inverso.
        5. Escribe un programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'.
        6. Escribe un programa para imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.
        7. Escribe un programa para imprimir todos los números pares entre 1 y 100.
        8. Escribe un programa para imprimir todos los números impares entre 1 y 100.
        9. Escribe un programa para encontrar la suma de todos los números naturales entre 1 y n.
        10. Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
        11. Escribe un programa para encontrar la suma de todos los números impares entre 1 y n.
        12. Escribe un programa para imprimir los valores ASCII.
        13. Escribe un programa para encontrar el factorial de cualquier número.
        14. Escribe un programa para calcular el valor de un número elevado a la potencia de otro.
        15. Escribe un programa para invertir los dígitos de un número dado.
        16. Escribe un programa para calcular la suma de los dígitos de un número.
        17. Escribe un programa para verificar si un número dado es primo o no.
        18. Escribe un programa para calcular el MCD (Máximo Común Divisor) de dos números dados.
        19. Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre la
        cantidad de números positivos, negativos y ceros ingresados.
        20. Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el
        número más grande y el más pequeño ingresado.
        21. Escribe un programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean
        divisibles por 9.
        22. Escribe un programa para convertir un número binario a decimal sin usar arreglos, funciones ni bucles
        while.
        23. Escribe un programa para verificar si un número es un Número Fuerte o no.
        24. Escribe un programa para convertir un número hexadecimal a decimal.
        25. Escribe un programa para convertir un número hexadecimal a octal.
        26. Escribe un programa para convertir un número hexadecimal a binario.
        27. Escribe un programa para convertir un número decimal a hexadecimal.
        28. Escribe un programa para convertir un número decimal a octal.
        29. Escribe un programa para convertir un número decimal a binario.
        30. Escribe un programa para convertir un número binario a octal.
        31. Escribe un programa para convertir un número binario a decimal.
        32. Escribe un programa para convertir un número binario a hexadecimal.
        33. Escribe un programa para convertir un número octal a binario.
        34. Escribe un programa para convertir un número octal a decimal.
        35. Escribe un programa para convertir un número octal a hexadecimal.
        36. Escribe un programa para encontrar el complemento a 1 de un número en Java.
        37. Escribe un programa para encontrar el complemento a 2 de un número binario en Java.
        38. Escribe un programa para imprimir la serie de Fibonacci hasta n términos.
        39. Escribe un programa para verificar si un número es un Número Fuerte o no.
        40. Escribe un programa para imprimir todos los Números Fuertes del 1 al 100000.
        41. Escribe un programa para imprimir todos los Números Perfectos del 1 al 10000.
        42. Escribe un programa para verificar si un número es un Número Perfecto o no.
        43. Escribe un programa para imprimir todos los Números de Armstrong entre 1 y 1000.
        44. Escribe un programa para verificar si un número es un Número de Armstrong o no.
        45. Escribe un programa para imprimir los factores primos en Java.
        46. Salir del programa
        """);
    }

    static void fuerte(String fuerte){
        int sumaFactorial = 0;
        for (int i = 0; i < fuerte.length(); i++) {
            
            int factorial23 = Character.getNumericValue(fuerte.charAt(i));
            for (int x = Character.getNumericValue(fuerte.charAt(i))-1; x > 0; x--) {
                factorial23 = factorial23*x;
            }
            sumaFactorial+=factorial23;
        }
        if (Integer.parseInt(fuerte) == sumaFactorial) {
            System.out.println("es un numero fuerte");
        }
        else{
            System.out.println("no es un numero fuerte");
        }
    }
    static String fuerte2(String fuerte){
        int sumaFactorial = 0;
        for (int i = 0; i < fuerte.length(); i++) {
            
            int factorial23 = Character.getNumericValue(fuerte.charAt(i));
            for (int x = Character.getNumericValue(fuerte.charAt(i))-1; x > 0; x--) {
                factorial23 = factorial23*x;
            }
            sumaFactorial+=factorial23;
        }
        if (Integer.parseInt(fuerte) == sumaFactorial) {
            return fuerte;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean bucle = true;
        while (bucle == true){
            menu();
            String opc = scan.nextLine();
            switch (opc) {
                case "1":
                    System.out.println("ingresa un numero");
                    int numeros_naturales = scan.nextInt();
                    scan.nextLine();
                    for (int i = 1; i <= numeros_naturales; i++) {
                        System.out.println(i);
                    }
                    scan.nextLine();
                    break;
                case "2":
                    System.out.println("ingresa un numero");
                    int numeros_naturales_r = scan.nextInt();
                    scan.nextLine();
                    for (int i = numeros_naturales_r; i > 0; i--) {
                        System.out.println(i);
                    }
                    scan.nextLine();
                    break;
                case "3":
                    System.out.println("ingresa un numero");
                    int numero_tablas = scan.nextInt();
                    scan.nextLine();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero_tablas +" * "+i+" = "+numero_tablas*i);
                    }
                    scan.nextLine();
                    break;
                case "4":
                    System.out.println("ingresa un numero");
                    int numero_tablas_r = scan.nextInt();
                    scan.nextLine();
                    for (int i = 10; i >0; i--) {
                        System.out.println(numero_tablas_r +" * "+i+" = "+numero_tablas_r*i);
                    }
                    scan.nextLine();
                    break;
                case "5":
                    for (char c = 'A'; c <= 'Z'; c++) {
                        System.out.println(c);
                    }
                    scan.nextLine();
                    break;
                case "6":
                    for (char c = 'Z'; c >= 'A'; c--) {
                        System.out.println(c);
                    }
                    scan.nextLine();
                    break;
                case "7":
                    for (int i = 1; i <= 100; i++) {
                        if (i%2 == 0) {
                            System.out.println(i);
                        }
                    }
                    scan.nextLine();
                    break;
                case "8":
                    for (int i = 1; i <= 100; i++) {
                        if (i%2 != 0) {
                            System.out.println(i);
                        }
                    }
                    scan.nextLine();
                    break;
                case "9":
                    System.out.println("ingresa un numero");
                    int numero_sumatoria = scan.nextInt();
                    scan.nextLine();
                    int total_sumatoria = 0;
                    for (int i = 1; i <= numero_sumatoria; i++) {
                        total_sumatoria = total_sumatoria+i;
                    }
                    System.out.println(total_sumatoria);
                    scan.nextLine();
                    break;
                case "10":
                    System.out.println("ingresa un numero");
                    int numero_sumatoria_par = scan.nextInt();
                    scan.nextLine();
                    int total_sumatoria_par = 0;
                    for (int i = 1; i <= numero_sumatoria_par; i++) {
                        if (i%2 == 0) {
                            total_sumatoria_par = total_sumatoria_par+i;
                        }
                    }
                    System.out.println(total_sumatoria_par);
                    scan.nextLine();
                    break;
                case "11":
                    System.out.println("ingresa un numero");
                    int numero_sumatoria_impar = scan.nextInt();
                    scan.nextLine();
                    int total_sumatoria_impar = 0;
                    for (int i = 1; i <= numero_sumatoria_impar; i++) {
                        if (i%2 != 0) {
                            total_sumatoria_impar = total_sumatoria_impar+i;
                        }
                    }
                    System.out.println(total_sumatoria_impar);
                    scan.nextLine();
                    break;
                case "12":
                    for (int i = 32; i <= 126; i++) {
                        System.out.println((char) i);
                    }
                    scan.nextLine();
                    break;
                case "13":
                    System.out.println("ingresa un numero");
                    int numero_factorial = scan.nextInt();
                    scan.nextLine();
                    int factorial = numero_factorial;
                    for (int i = numero_factorial-1; i > 0; i--) {
                        factorial = factorial*i;
                    }
                    System.out.println(factorial);
                    scan.nextLine();
                    break;
                case "14":
                    System.out.println("ingresa un numero base");
                    int numero_base = scan.nextInt();
                    scan.nextLine();
                    System.out.println("ingresa un numero exponente");
                    int numero_exponente = scan.nextInt();
                    scan.nextLine();
                    int resutado_numeroExponencial = numero_base;
                    for (int i = 1; i < numero_exponente; i++) {
                        resutado_numeroExponencial = resutado_numeroExponencial*numero_base;
                    }
                    System.out.println(resutado_numeroExponencial);
                    scan.nextLine();
                    break;
                case "15":
                    System.out.println("ingresa un numero");
                    String numero_Invertir = scan.nextLine();
                    for (int i = numero_Invertir.length()-1; i >= 0; i--) {
                        System.out.print(numero_Invertir.charAt(i));
                    }
                    scan.nextLine();
                    break;
                case "16":
                    System.out.println("ingresa un numero");
                    String numeroSumar = scan.nextLine();
                    int total_numeroSumar = 0;
                    for (int i = 0; i < numeroSumar.length(); i++) {
                        total_numeroSumar = total_numeroSumar + Character.getNumericValue(numeroSumar.charAt(i));
                    }
                    System.out.println(total_numeroSumar);
                    scan.nextLine();
                    break;
                case "17":
                    System.out.println("ingresa un numero");
                    int numero_primo = scan.nextInt();
                    scan.nextLine();
                    String es_primo = "El numero es primo";
                    for (int i = 2; i < numero_primo-1; i++) {
                        if (numero_primo % i == 0) {
                            es_primo = "El numero no es primo";
                        }
                    }
                    System.out.println(es_primo);
                    scan.nextLine();
                    break;
                case "18":
                    System.out.println("ingresa un numero 1");
                    int numero_1mcd = scan.nextInt();
                    scan.nextLine();
                    System.out.println("ingresa un numero 2");
                    int numero_2mcd = scan.nextInt();
                    scan.nextLine();
                    int mcd = 0;
                    boolean b18 = true;
                    while (b18==true) {
                        if (numero_1mcd % numero_2mcd != 0) {
                            mcd=numero_2mcd;
                            numero_2mcd = numero_1mcd % numero_2mcd;
                            numero_1mcd = mcd;
                        }
                        else{
                            System.out.println(numero_2mcd);
                            b18=false;
                        }
                    }
                    scan.nextLine();
                    break;
                case "19":
                    System.out.println("ingresa numeros separados por espacios");
                    String lista_numeroString = scan.nextLine();
                    List<String> numeros_19 = new ArrayList<>();
                    int positivos = 0;
                    int ceros = 0;
                    int negativos = 0;
                    numeros_19 = Arrays.asList(lista_numeroString.split(" "));
                    for (String i : numeros_19) {
                        if (Integer.parseInt(i) > 0) {
                            positivos++;
                        }
                        else if (Integer.parseInt(i) < 0) {
                            negativos++;
                        }
                        else{
                            ceros++;
                        }
                    }
                    System.out.println("positivos = "+positivos+"  negativos = "+negativos+"  ceros = "+ceros);
                    scan.nextLine();
                    break;
                case "20":
                    System.out.println("ingresa numeros separados por espacios");
                    String lista_numeroString20 = scan.nextLine();
                    List<String> numeros_20 = new ArrayList<>();
                    numeros_20 = Arrays.asList(lista_numeroString20.split(" "));
                    int numero_menor = Integer.parseInt(numeros_20.get(0));
                    int numero_mayor = Integer.parseInt(numeros_20.get(0));
                    for (String i : numeros_20) {
                        if (Integer.parseInt(i) > numero_mayor) {
                            numero_mayor = Integer.parseInt(i);
                        }
                        if (Integer.parseInt(i) < numero_menor) {
                            numero_menor = Integer.parseInt(i);
                        }
                    }
                    System.out.println("numero mayor = "+numero_mayor+"  numero menor = "+numero_menor);
                    scan.nextLine();
                    break;
                    case "21":
                    int total_9 = 0;
                    for (int i = 100; i <= 200; i++) {
                        if (i%9 == 0) {
                            System.out.println(i);
                            total_9 = total_9 + i;
                        }
                    }
                    System.out.println(total_9);
                    scan.nextLine();
                    break;
                case "22":
                    System.out.print("Ingrese un número binario: ");
                    String binario22 = scan.nextLine();
                    int resultado22 = 0;
                    for (int i = 0; i < binario22.length(); i++) {
                        int r22 = 1;
                        for (int j = i; j<binario22.length()-1; j++) {
                            r22*=2;
                        }
                        resultado22 += Character.getNumericValue(binario22.charAt(i))*r22;
                    }
                    System.out.println(resultado22);
                    scan.nextLine();
                    break;
                case "23":
                    System.out.print("Ingrese un número: ");
                    String fuerte = scan.nextLine();
                    fuerte(fuerte);
                    scan.nextLine();
                    break;
                case "24":
                    System.out.print("Ingrese un número: ");
                    String h24 = scan.nextLine();
                    System.out.println(Integer.parseInt(h24,16));
                    scan.nextLine();
                    break;
                case "25":
                    System.out.print("Ingrese un número: ");
                    String h25 = scan.nextLine();
                    int d25 = Integer.parseInt(h25,16);
                    System.out.println(Integer.toOctalString(d25));
                    scan.nextLine();
                    break;
                case "26":
                    System.out.print("Ingrese un número: ");
                    String h26 = scan.nextLine();
                    int b25 = Integer.parseInt(h26,16);
                    System.out.println(Integer.toBinaryString(b25));
                    scan.nextLine();
                    break;
                case "27":
                    System.out.print("Ingrese un número: ");
                    int d27 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(Integer.toHexString(d27).toUpperCase());
                    scan.nextLine();
                    break;
                case "28":
                    System.out.print("Ingrese un número: ");
                    int d28 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(Integer.toOctalString(d28));
                    scan.nextLine();
                    break;
                case "29":
                    System.out.print("Ingrese un número: ");
                    int d29 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(Integer.toBinaryString(d29));
                    scan.nextLine();
                    break;
                case "30":
                    System.out.print("Ingrese un número: ");
                    String b30 = scan.nextLine();
                    String o30 = Integer.toOctalString(Integer.parseInt(b30,2));
                    System.out.println(o30);
                    scan.nextLine();
                    break;
                case "31":
                    System.out.print("Ingrese un número: ");
                    String b31 = scan.nextLine();
                    System.out.println(Integer.parseInt(b31,2));
                    scan.nextLine();
                    break;
                case "32":
                    System.out.print("Ingrese un número: ");
                    String b32 = scan.nextLine();
                    String hex32 = Integer.toHexString(Integer.parseInt(b32,2)).toUpperCase();
                    System.out.println(hex32);
                    scan.nextLine();
                    break;
                case "33":
                    System.out.print("Ingrese un número: ");
                    String o33 = scan.nextLine();
                    String b33 = Integer.toBinaryString(Integer.parseInt(o33,8));
                    System.out.println(b33);
                    scan.nextLine();
                    break;
                case "34":
                    System.out.print("Ingrese un número: ");
                    String o34 = scan.nextLine();
                    System.out.println(Integer.parseInt(o34,8));
                    scan.nextLine();
                    break;
                case "35":
                    System.out.print("Ingrese un número: ");
                    String o35 = scan.nextLine();
                    String hex35 = Integer.toHexString(Integer.parseInt(o35,8)).toUpperCase();
                    System.out.println(hex35);
                    scan.nextLine();
                    break;
                case "36":
                    System.out.print("Ingrese un número: ");
                    int n36 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("complemento a1 = "+ ~n36);
                    scan.nextLine();
                    break;
                case "37":
                    System.out.print("Ingrese un número: ");
                    String b37 = scan.nextLine();
                    int n37 = Integer.parseInt(b37,2);
                    System.out.println("complemento a2 = "+ Integer.toBinaryString(~n37+1));
                    scan.nextLine();
                    break;
                case "38":
                    System.out.print("Ingrese un número: ");
                    int n38 = scan.nextInt();
                    scan.nextLine();
                    int a=0;
                    int b=1;
                    int c = 0;
                    for (int i = 0; i < n38; i++) {
                        c=a+b;
                        System.out.println(a);
                        a=b;
                        b=c;
                    }
                    scan.nextLine();
                    break;
                case "40":
                    for (int i = 1; i <= 100000; i++) {

                        if (fuerte2(Integer.toString(i))!=null) {
                            System.out.println(i);
                        }
                    }
                    scan.nextLine();
                    break;
                case "41":
                    
                    for (int i = 0; i < 10000; i++) {
                        int suma_41 = 0;
                        for (int j = 1; j < i; j++) {
                            if (i%j == 0) {
                                suma_41+=j;
                            }
                        }
                        if (suma_41==i) {
                            System.out.println(i);
                        }
                    }
                    scan.nextLine();
                    break;
                case "42":
                    System.out.print("Ingrese un número: ");
                    int n42 = scan.nextInt();
                    scan.nextLine();
                    int suma_42 = 0;
                    for (int j = 1; j < n42; j++) {
                        if (n42%j == 0) {
                            suma_42+=j;
                        }
                    }
                    if (suma_42==n42) {
                        System.out.println("es un numero perfecto");
                    }
                    else{
                        System.out.println("no es un numero perfecto");
                    }
                    scan.nextLine();
                    break;
                case "43":
                break;
                case "44":
                
                    System.out.print("Ingrese un número: ");
                    String n44 = scan.nextLine();
                    int suma_44 = 0;
                    for (int i = 0; i < n44.length(); i++) {
                        int potencia44 = 1;
                        for (int j = 1; j < n44.length()+1; j++) {
                            potencia44*=n44.charAt(i)-'0';
                        }
                        suma_44+=potencia44;
                    }
                    if (suma_44 == Integer.parseInt(n44)) {
                        System.out.println("el numero es astro");
                    }else System.out.println("el numero no es astro");
                    scan.nextLine();
                    break;
                case "45":
                    
                    break;
                case "46":
                    bucle=false;
                    break;
                default:
                    System.out.println("opción no valida");
            }
            
        }
        
    }
    
}
