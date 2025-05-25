package wildcards;

import generics_with_extends.entities.Animal;
import generics_with_extends.entities.Cachorro;
import generics_with_extends.entities.Gato;

import java.util.List;

public class BoundedWildcard {

    public static void main(String[] args) {
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());

        printList(cachorros);
        printList(gatos);
    }

    //generic wildcard limitado
    public static void printList(List<? extends Animal> list) {
        System.out.println(list);
    }
}
