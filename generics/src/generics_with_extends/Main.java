package generics_with_extends;

import generics_with_extends.entities.Cachorro;
import generics_with_extends.entities.Gato;
import generics_with_extends.entities.PacienteVeterinario;

public class Main {

    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        PacienteVeterinario<Gato> paciente1 = new PacienteVeterinario<>(gato);
        PacienteVeterinario<Cachorro> paciente2 = new PacienteVeterinario<>(cachorro);

        paciente1.cuidandoPaciente();
        paciente2.cuidandoPaciente();

    }
}
