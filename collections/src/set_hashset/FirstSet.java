package set_hashset;

import java.util.HashSet;
import java.util.Set;

public class FirstSet {

    public static void main(String[] args) {
        //é um conjunto de dados que não permite valores repetidos e não tem index
        //HashSet é um set que utiliza HashMap
        Set<String> nomes = new HashSet<>();

        nomes.add("Daniel");
        nomes.add("João");
        nomes.add("Marcelo");
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("Daniel");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
