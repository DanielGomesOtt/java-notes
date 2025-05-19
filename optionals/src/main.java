import entities.Person;

import java.util.Optional;

public class main {

    public static void main(String[] args) {
        // podemos usar para encapsular o retorno dentro de um optional para caso o valor não possa ser retornado, ele retorno um optional vazio
        Optional<Person> person = getPersonByName("Daniel");

        person.ifPresentOrElse(op -> System.out.println(op.getName()), () -> System.out.println("Não existe uma pessoa com esse nome"));
       /*
       * Existem outro métodos para utilizar com o optionals como:
       * .ifPresent -> retorno só se tiver valor
       * .orElseThrow -> retorno de tiver resultado, se não tiver joga uma NoSuchElementException
       * Tem vários outros métodos, utilize a documentação caso precise
       * */
    }

    public static Optional<Person> getPersonByName(String name) {
        return Optional.ofNullable(new Person("Daniel", 25));
    }
}
