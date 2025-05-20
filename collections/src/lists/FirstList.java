package lists;

import java.util.ArrayList;
import java.util.List;

public class FirstList {

    public static void main(String[] args) {
        //No genéric das lists só pode passar Wrappers. Não pode passar primitivos
        List<String> nomes = new ArrayList<>();

        nomes.add("Daniel");
        nomes.add("Ott");

        System.out.println("Exibindo valores iterando");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-------------------------------------");
        System.out.println("Iterando com index");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        //da para remover por index e por valor
        nomes.remove(0);
        nomes.remove("Ott");

        System.out.println(nomes);

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("João");
        nomes2.add("Silva");

        //adicionando uma lista dentro da outra
        nomes.addAll(nomes2);

        System.out.println(nomes);

    }
}
