
public class personal {
    int id_persona;
    int salario;
    String cargo;

    public personal(int id_persona, int salario, String cargo) {
        this.id_persona = id_persona;
        this.salario = salario;
        this.cargo = cargo;
    }
    public void mostrar(){
        System.out.println("Id persona: "+id_persona+"  salario: "+salario+"  cargo: "+cargo);
    }
}
