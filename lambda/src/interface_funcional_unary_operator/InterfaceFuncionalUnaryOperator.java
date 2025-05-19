package interface_funcional_unary_operator;

import java.util.function.UnaryOperator;

public class InterfaceFuncionalUnaryOperator {

    public static void main(String[] args) {
        //interface funcional que recebe um parametro de um tipo e o retorno é do mesmo tipo
        UnaryOperator<Integer> maisUm = num -> num + 1;

        // para executar usamos o .apply
        System.out.println(maisUm.apply(1));
    }
}
