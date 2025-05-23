package Map;

import java.util.HashMap;
import java.util.Map;

public class FirstMap {

    public static void main(String[] args) {
        //Map é interface e p resto como HashMap, HashLinkedMap, TreeMap são implementações de Map
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Daniel");
        clientes.put(2, "João");
        clientes.put(3, "Carlos");
        clientes.put(4, "Bruno");

        System.out.println(clientes.containsKey(1));
        System.out.println(clientes.containsValue("Carlos"));
        clientes.putIfAbsent(5, "Fabio");
        System.out.println(clientes.values());

        for (Map.Entry<Integer, String> entry : clientes.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " " + "Nome: " + entry.getValue());
        }

    }
}