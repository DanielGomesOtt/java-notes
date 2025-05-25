package first_generic;

import first_generic.entities.Printer;

public class FirstGeneric {

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(1);
        Printer<String> stringPrinter = new Printer<>("Daniel");

        integerPrinter.printSomething();
        stringPrinter.printSomething();

    }
}
