package equals;

import equals.entities.Smartphone;

public class Main {

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABG2", "Iphone");
        Smartphone s2 = new Smartphone("1ABG2", "Iphone");
        System.out.println(s1.equals(s2));

    }
}
