package interface_funcional_consumer;

import java.util.function.Consumer;

public class InterfaceFuncionalConsumer {

    public static void main(String[] args) {

        //interface funcional que recebe um parametro e não retorna nada
        Consumer<String> mostrarNome = nome -> System.out.println("Olá meu nome é " + nome);

        //utiliza o .accept para executar
        mostrarNome.accept("Daniel");
    }
}
