
public class paciente {
    int id_persona;
    int id_pabellon;
    String diagnostico;
    int id_doctor;

    public paciente(int id_persona, int id_pabellon, String diagnostico, int id_doctor) {
        this.id_persona = id_persona;
        this.id_pabellon = id_pabellon;
        this.diagnostico = diagnostico;
        this.id_doctor = id_doctor;
    }
    public void mostrar(){
        System.out.println("Id persona: "+id_persona+"  id pabellon: "+id_pabellon+"  diagnostico: "+diagnostico+"  id doctor: "+id_doctor);
    }
}
