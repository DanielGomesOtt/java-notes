package queue;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class FirstQueue {

    public static void main(String[] args) {

        //Lembre se, fila é FIFO(FIRST IN FIRST OUT)

        //aqui estamos usando uma implementação que é uma fila ordenada. A ordem ocorre na saida
        Queue<String> fila = new PriorityQueue<>();
         fila.add("Daniel");
         fila.add("Ana");
         fila.add("Gustavo");
         fila.add("Willian");

        System.out.println(fila);
         //mostra o primeiro elemento
        System.out.println(fila.peek());

        //insere um elemento na fila e retorna um boolean
        System.out.println(fila.offer("João"));

        //retira o elemente que está na frente na fila
        System.out.println(fila.poll());

        System.out.println(fila);
    }

}
