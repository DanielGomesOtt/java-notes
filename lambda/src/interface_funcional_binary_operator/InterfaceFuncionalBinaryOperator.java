package interface_funcional_binary_operator;

import java.util.function.BinaryOperator;

public class InterfaceFuncionalBinaryOperator {

    public static void main(String[] args) {
        //interface funcional recebe dois parametros do mesmo tipo e o retorno é do mesmo tipo dos parametros
        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        //para executar usamos .apply
        System.out.println(soma.apply(1, 6));
    }
}
