package binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstBinarySearch {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(1);
        numeros.add(9);

        //para usar binary search precisa que a lista esteja ordenada
        Collections.sort(numeros);

        //o binary search irá retorna o indice do elemento passado
        System.out.println(Collections.binarySearch(numeros, 6));



    }
}
