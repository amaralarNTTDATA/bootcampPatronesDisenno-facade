import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFacade {

    List<Person> listaPersonas = Arrays.asList(
            new Person("Pepito", 45),
            new Person("Juan", 28),
            new Person("Ana", 22),
            new Person("Laura", 30),
            new Person("Antonio", 18),
            new Person("Pepe", 56)
    );

    public List<String> getListaPersonas() {

        return listaPersonas.stream()
                .filter(p -> p.getAge() >= 20 && p.getAge() <= 30)
                .map(Person::getName)
                .collect(Collectors.toList());

    }

}
