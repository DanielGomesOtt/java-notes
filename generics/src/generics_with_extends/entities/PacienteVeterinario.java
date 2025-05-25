package generics_with_extends.entities;

public class PacienteVeterinario <T extends Animal>{

    T animal;

    public PacienteVeterinario(T animal) {
        this.animal = animal;
    }
    public void cuidandoPaciente() {
        System.out.println("Atendendo o  " + this.animal.getClass());
    }
}
