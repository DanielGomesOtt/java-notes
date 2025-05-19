package interface_funcional_function;

import java.util.function.Function;

public class InterfaceFuncionalFunction {

    public static void main(String[] args) {

        //interface funcional que deixa eespecificar o tipo do parametro e do retorno
        Function<String, Integer> tamanhoNome = String::length;
        Function<Integer, String> mostrarTamanhoNome = num -> "O nome informado tem " + num + " letras";

        //para executar usamos apply
        //usamos andThen para executar outra função no caminho
        //tamanhoNome é executado e passa seu resultado para mostrarTamanho
        //mostrarTamanho pega o resultado de tamanhoNome e forma o texto apresentado na tela
        System.out.println(tamanhoNome.andThen(mostrarTamanhoNome).apply("Daniel"));
    }
}
