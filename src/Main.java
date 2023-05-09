import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonFacade personFacade = new PersonFacade();

        List<String> list = personFacade.getListaPersonas();

        list.stream().forEach(System.out::println);


    }
}