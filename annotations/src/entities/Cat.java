package entities;

import annotations.ImportantString;
import annotations.RunImmediately;
import annotations.VeryImportant;

@VeryImportant
public class Cat {

    @ImportantString
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @RunImmediately(times = 3)
    public void meow () {
        System.out.println("Meow!");
    }
}
