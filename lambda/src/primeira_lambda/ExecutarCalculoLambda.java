package primeira_lambda;

public class ExecutarCalculoLambda {

    public static void main(String[] args) {
        Calculo calculo = (x, y) -> {return x + y;}; //lambda expression fazendo soma

        System.out.println(calculo.executar(2.0, 3.0));

        calculo = (x, y) -> x * y; // lambda expression fazendo multiplicação

        System.out.println(calculo.executar(2.0, 3.0));
    }
}
