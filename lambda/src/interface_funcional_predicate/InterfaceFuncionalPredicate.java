package interface_funcional_predicate;

import java.util.function.Predicate;

public class InterfaceFuncionalPredicate {

    public static void main(String[] args) {
        //interface funcional que recebe um parametro e retorna um boolean
        Predicate<Integer> par = num -> num % 2 == 0;

        //usa o .test para executar
        System.out.println(par.test(3));
        System.out.println(par.test(2));
    }
}
