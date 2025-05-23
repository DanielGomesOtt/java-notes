package navigable_set_tree_set;

import navigable_set_tree_set.entities.Manga;

import java.util.NavigableSet;
import java.util.TreeSet;

public class FirstNavigableSet {

    public static void main(String[] args) {
        //tree set é um set ordenado, ele precisa ter um comparator passado na declaração ou a classe passada para ele precisa ter um comparable
        NavigableSet<Manga> mangas = new TreeSet<>();

        mangas.add(new Manga(1L, "Naruto", 15.99));
        mangas.add(new Manga(2L, "Bleach", 12.99));
        mangas.add(new Manga(3L, "Black Cover", 17.99));
        mangas.add(new Manga(4L, "Kimetsu no Yaiba", 19.99));
        mangas.add(new Manga(5L, "Akagi", 10.99));

        Manga yuyu = new Manga(5L, "Yuyu Hakusho", 14.99);
        Manga myhero = new Manga(6L, "My hero academia", 14.99);

        //exibição normal
        System.out.println(mangas);

        //ordem ao contrario
        System.out.println(mangas.descendingSet());

        //lower <
        System.out.println(mangas.lower(yuyu));

        //floor <=
        System.out.println(mangas.floor(yuyu));

        //higher >
        System.out.println(mangas.higher(myhero));

        //ceiling >=
        System.out.println(mangas.ceiling(myhero));

        System.out.println(mangas.size());
        //tira o primeiro item do set
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        //tira o ultimo item do set
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}
