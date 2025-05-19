package interface_funcional_supplier;

import java.util.List;
import java.util.function.Supplier;

public class InterfaceFuncionalSupplier {

    public static void main(String[] args) {
        //interface funcional que não recebe nenhum parametro e só retorna
        Supplier<List<String>> listaNomes = () -> List.of("Daniel", "Maria", "Emanuel");

        //para resgatar o retorno usamos .get
        System.out.println(listaNomes.get());
    }
}
