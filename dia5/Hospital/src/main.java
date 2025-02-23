
import java.util.ArrayList;
import java.util.Scanner;


public class main {

    static void menu(){
        System.out.println("""
        ------ CRUD ------
        1. Añadir
        2. actualizar
        3. Leer
        4. Eliminar
        5. Salir
        """);
    }
    static void opciones(){
        System.out.println("""
        ------ CRUD Opciones ------
        1. personas
        2. personal
        3. hospitales
        4. paciente
        5. pabellon
        6. Volver al menú principal
        """);
    }

    public static void main(String[] args) {
        
        ArrayList<personas> lista_personas = new ArrayList<>();
        ArrayList<hospital> lista_hospital = new ArrayList<>();
        ArrayList<personal> lista_personal = new ArrayList<>();
        ArrayList<paciente> lista_paciente = new ArrayList<>();
        ArrayList<pabellon> lista_pebellon = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        String opciones = null;
        boolean bucle = true;
        while (bucle == true) {
            menu();
            boolean buclecito = true;
            String opc = scan.nextLine();
            switch (opc) {
                case "1":
                    while (buclecito==true) {
                        opciones();
                        opciones = scan.nextLine();
                        switch (opciones) {
                            case "1":
                                System.out.println("Ingresa los datos de la persona que deseas agregar");
                                System.out.println("id");
                                int id = scan.nextInt();
                                scan.nextLine();
                                System.out.println("nombre");
                                String nombre = scan.nextLine();
                                System.out.println("apellidos");
                                String apellidos = scan.nextLine();
                                System.out.println("fecha de nacimiento");
                                String fecha_nacimiento = scan.nextLine();
                                System.out.println("dirección");
                                String direccion = scan.nextLine();
                                System.out.println("fecha de ingreso");
                                String fecha_ingreso = scan.nextLine();
                                System.out.println("titulo");
                                String titulo = scan.nextLine();
                                lista_personas.add(new personas(id, nombre, apellidos, fecha_nacimiento, direccion, fecha_ingreso, titulo));
                                break;
                            case "2":
                                System.out.println("agregar persona al personal");
                                System.out.println("id de la persona");
                                int id_persona = scan.nextInt();
                                scan.nextLine();
                                System.out.println("salario");
                                int salario = scan.nextInt();
                                scan.nextLine();
                                System.out.println("cargo");
                                String cargo = scan.nextLine();
                                lista_personal.add(new personal(id_persona, salario, cargo));
                                break;
                            case "3":
                                System.out.println("agregar un hospital");
                                System.out.println("id");
                                int id_hospital = scan.nextInt();
                                scan.nextLine();
                                System.out.println("nombre");
                                String nombre_hospital = scan.nextLine();
                                lista_hospital.add(new hospital(id_hospital, nombre_hospital));
                                break;
                            case "4":
                                System.out.println("agregar un paciente");
                                System.out.println("id de la persona");
                                int id_persona_paciente = scan.nextInt();
                                System.out.println("id pabellon");
                                int id_pabellon_P = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Diagnostico");
                                String diagnostico = scan.nextLine();;
                                System.out.println("id del doctor");
                                int id_doctor = scan.nextInt();
                                scan.nextLine();
                                break;
                            case "5":
                                System.out.println("Agregar nuevo pabellon");
                                System.out.println("Id del pavellon");
                                int id_pabellon = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Id del hospital al que pertenece");
                                int id_hospital_p = scan.nextInt();
                                scan.nextLine();
                                System.out.println("nombre");
                                String nombre_P = scan.nextLine();;
                                System.out.println("capacidad");
                                int capacidad = scan.nextInt();
                                scan.nextLine();
                                break;
                            case "6":
                                buclecito=false;
                                break;
                            
                            default:
                                break;
                        }
                    }
                    break;
                case "2":
                    while (buclecito==true) {
                        int id_actualizar;
                        opciones();
                        opciones = scan.nextLine();
                        switch (opciones) {
                            case "1":
                                for (personas p : lista_personas) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas actualizar");
                                id_actualizar = scan.nextInt();
                                scan.nextLine();
                                System.out.println("ingresa la nueva dirección de la persona");
                                String nueva_direccion = scan.nextLine();
                                for (personas p : lista_personas) {
                                    if (id_actualizar == p.id) {
                                        p.direccion = nueva_direccion;
                                    }
                                }
                                break;
                            case "2":
                                for (personal p : lista_personal) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas actualizar");
                                id_actualizar = scan.nextInt();
                                scan.nextLine();
                                System.out.println("nuevo salario");
                                int nuevo_salario = scan.nextInt();
                                scan.nextLine();
                                for (personal p : lista_personal) {
                                    if (p.id_persona == id_actualizar) {
                                        p.salario = nuevo_salario;
                                    }
                                }
                                break;
                            case "3":
                                for (hospital p : lista_hospital) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas actualizar");
                                id_actualizar = scan.nextInt();
                                scan.nextLine();
                                System.out.println("nuevo nombre");
                                String nuevo_nombre_hospital = scan.nextLine();
                                for (hospital p : lista_hospital) {
                                    if (p.id == id_actualizar) {
                                        p.nombre = nuevo_nombre_hospital;
                                    }
                                }
                                break;
                            case "4":
                                for (paciente p : lista_paciente) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas actualizar");
                                id_actualizar = scan.nextInt();
                                scan.nextLine();
                                System.out.println("nuevo nombre");
                                String nuevo_diagnostico = scan.nextLine();
                                for (paciente p : lista_paciente) {
                                    if (p.id_persona == id_actualizar) {
                                        p.diagnostico = nuevo_diagnostico;
                                    }
                                }
                                break;
                            case "5":
                                for (pabellon p : lista_pebellon) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas actualizar");
                                id_actualizar = scan.nextInt();
                                scan.nextLine();
                                System.out.println("nuevo nombre");
                                int nueva_capacidad = scan.nextInt();
                                for (pabellon p : lista_pebellon) {
                                    if (p.id == id_actualizar) {
                                        p.capacidad = nueva_capacidad;
                                    }
                                }
                                break;
                            case "6":
                                buclecito=false;
                                break;
                            
                            default:
                                break;
                        }
                    }
                    break;
                case "3":
                    while (buclecito==true) {
                        opciones();
                        opciones = scan.nextLine();
                        switch (opciones) {
                            case "1":
                                for (personas p : lista_personas) {
                                    p.mostrar();
                                }
                                scan.nextLine();
                                break;
                            case "2":
                                for (personal p : lista_personal) {
                                    p.mostrar();
                                }
                                scan.nextLine();
                                break;
                            case "3":
                                for (hospital h : lista_hospital) {
                                    h.mostrar();
                                }
                                scan.nextLine();
                                break;
                            case "4":
                                for (paciente p : lista_paciente) {
                                    p.mostrar();
                                }
                                scan.nextLine();
                                break;
                            case "5":
                                for (pabellon p : lista_pebellon) {
                                    p.mostrar();
                                }
                                scan.nextLine();
                                break;
                            case "6":
                                buclecito=false;
                                break;
                            
                            default:
                                break;
                        }
                    }
                    break;
                case "4":
                    while (buclecito==true) {
                        int id_eliminar;
                        opciones();
                        opciones = scan.nextLine();
                        switch (opciones) {
                            case "1":
                                for (personas p : lista_personas) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas eliminar");
                                id_eliminar = scan.nextInt();
                                scan.nextLine();
                                for (personas p : lista_personas) {
                                    if (p.id == id_eliminar) {
                                        lista_personas.remove(p);
                                        break;
                                    }
                                }
                                break;
                            case "2":
                                for (personal p : lista_personal) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas eliminar");
                                id_eliminar = scan.nextInt();
                                scan.nextLine();
                                for (personal p : lista_personal) {
                                    if (p.id_persona == id_eliminar) {
                                        lista_personal.remove(p);
                                        break;
                                    }
                                }
                                break;
                            case "3":
                                for (hospital h : lista_hospital) {
                                    h.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas eliminar");
                                id_eliminar = scan.nextInt();
                                scan.nextLine();
                                for (hospital p : lista_hospital) {
                                    if (p.id == id_eliminar) {
                                        lista_hospital.remove(p);
                                        break;
                                    }
                                }
                                break;
                            case "4":
                                for (paciente p : lista_paciente) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas eliminar");
                                id_eliminar = scan.nextInt();
                                scan.nextLine();
                                for (paciente p : lista_paciente) {
                                    if (p.id_persona == id_eliminar) {
                                        lista_paciente.remove(p);
                                        break;
                                    }
                                }
                                break;
                            case "5":
                                for (pabellon p : lista_pebellon) {
                                    p.mostrar();
                                }
                                System.out.println("Ingresa el id del que deseas eliminar");
                                id_eliminar = scan.nextInt();
                                scan.nextLine();
                                for (pabellon p : lista_pebellon) {
                                    if (p.id == id_eliminar) {
                                        lista_pebellon.remove(p);
                                        break;
                                    }
                                }
                                break;
                            case "6":
                                buclecito=false;
                                break;
                            
                            default:
                                break;
                        }
                    }
                    break;
                case "5":
                    bucle=false;
                    break;
                default:
                    System.out.println("opción no valida");
                    break;
            }
        }
        
    }
    
}
