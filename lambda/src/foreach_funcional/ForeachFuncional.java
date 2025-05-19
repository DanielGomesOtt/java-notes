package foreach_funcional;

import java.util.List;

public class ForeachFuncional {

    public static void main(String[] args) {
        List<String> nomes = List.of("Daniel", "Paula", "Gabriel", "Nicolas");

        System.out.println("\nForeach funcional normal");
        //foreach funcional 1
        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("\nMethod Reference");
        //method reference
        nomes.forEach(System.out::println);

        System.out.println("\nMethod reference com personalização");
        //method referencee com personalizacao
        nomes.forEach(ForeachFuncional::imprimirPersonalizado);
    }

    static void imprimirPersonalizado(String nome) {
        System.out.println("Olá " + nome);
    }
}
