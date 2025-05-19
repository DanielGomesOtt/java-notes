package Interface_funcional_predicado_composicao;

import java.util.function.Predicate;

public class InterfaceFuncionalPredicadoComposicao {

    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num.toString().length() == 3;

        //and da true se os 2 predicates forem true
        System.out.println(isPar.and(isTresDigitos).test(122));

        //or da true se pelo menos 1 dos predicates for true
        System.out.println(isPar.or(isTresDigitos).test(125));

        // era para dar false, mas com o uso do negate ele nega o resultado e da o contrario
        System.out.println(isPar.and(isTresDigitos).negate().test(123));
    }
}
