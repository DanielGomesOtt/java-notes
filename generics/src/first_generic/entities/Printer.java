package first_generic.entities;

public class Printer<T>{

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void printSomething(){
        System.out.println(thingToPrint);
    }
}
