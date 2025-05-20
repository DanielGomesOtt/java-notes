package lists;

import equals.entities.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class ListWithContains {

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("111111", "Iphone");
        Smartphone s2 = new Smartphone("222222", "Xiaomi");
        Smartphone s3 = new Smartphone("333333", "Nokia");

        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        Smartphone s4 = new Smartphone("333333", "Nokia");

        //está usando o equals da classe smartphone para verificar se o objeto está  no array, no caso o equals baseado no serial do smartphone
        System.out.println(smartphones.contains(s4));

        //conseguimos passar também o indice aonde queremos adicionar o item no arraylist
        smartphones.add(0, s4);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone.toString());
        }

        //está retornando o index do objeto passado no array. está usando o equals para achar o index
        System.out.println(smartphones.indexOf(s2));
    }
}
