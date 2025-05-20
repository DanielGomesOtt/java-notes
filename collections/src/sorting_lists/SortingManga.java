package sorting_lists;

import sorting_lists.entities.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingManga {

    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L, "Naruto", 19.90));
        mangas.add(new Manga(1L, "Bleach", 12.99));
        mangas.add(new Manga(4L, "Dragon Ball", 20.00));
        mangas.add(new Manga(2L, "Ano hana", 10.00));

        //antes de ordenar
        for (Manga manga : mangas) {
            System.out.println(manga.toString());
        }

        // ordena os elementos do array. no caso de objetos ele ordena de acordo com o compareTo do objeto.
        // Nesse caso a classe manga teve que implementar um compareTo para dizer para o java por qual elemento que ele iria ordenar os objetos da list
        Collections.sort(mangas);

        System.out.println("------------------------------");
        //depois de ordenar
        for (Manga manga : mangas) {
            System.out.println(manga.toString());
        }
    }
}
