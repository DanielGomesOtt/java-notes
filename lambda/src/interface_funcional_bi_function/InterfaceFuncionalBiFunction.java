package interface_funcional_bi_function;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class InterfaceFuncionalBiFunction {

    public static void main(String[] args) {
        // interface funcional aonde você pode passar 2 parametros de tipos diferentes e um retorno de tipo diferente
        BiFunction<String, Integer, Boolean> acertarTamanho = (palavra, tamanho) -> palavra.length() == tamanho;
        Function<Boolean, String> mostrarResultado = resultado -> resultado == true ? "Você acertou o tamanho do nome" : "Você errou o tamanho do nome";

        //usa .apply para executar
        System.out.println(acertarTamanho.andThen(mostrarResultado).apply("Daniel", 5));
    }
}
