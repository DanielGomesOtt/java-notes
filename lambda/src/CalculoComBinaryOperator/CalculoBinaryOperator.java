package CalculoComBinaryOperator;

import java.util.function.BinaryOperator;

public class CalculoBinaryOperator {

    public static void main(String[] args) {
        //ao invés de fazer uma interface funcional na mão, usamos uma do java
        //essa interface recebe 2 parametros do mesmo tipo e o retorno tem que ter o mesmo tupo dos parametros
        BinaryOperator<Double> calculo = (x, y) -> { return x + y;};
        //usamos a funcao apply para executar
        System.out.println(calculo.apply(3.5, 4.8));

        BinaryOperator<String> concatenar = (a, b) -> { return a + " " + b;};
        System.out.println(concatenar.apply("Hello", "World"));
    }
}
