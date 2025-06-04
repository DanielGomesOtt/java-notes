package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStream {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("grape");


        fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))//operação intermediaria
                .map(String::toUpperCase)//operação intermediaria
                .forEach(System.out::println);//operação terminal
        // não é possivel adicionar mais operações após uma operação terminal

        var listaModificada = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))//operação intermediaria
                .map(String::toUpperCase)//operação intermediaria
                .collect(Collectors.toList());//operação terminal
                //transformando a stream modificado em lista novamente

        System.out.println(listaModificada);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        var sum = numbers.stream().reduce(0, Integer::sum);// reduz todos os valores em 1 só
        System.out.println(sum);

    }
}
