package StreamsFilterExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterStream {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("sskim", 30),
                new Person("lsw", 20),
                new Person("lsy", 40)
        );

        String name = persons.stream()
                .filter(x -> "sskim".equals(x.getName()))
                .map(Person::getName)                        //convert stream to String
                .findAny()
                .orElse("");

        System.out.println("name : " + name);

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
