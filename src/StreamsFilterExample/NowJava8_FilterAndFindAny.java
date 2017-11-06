package StreamsFilterExample;

import java.util.Arrays;
import java.util.List;

public class NowJava8_FilterAndFindAny {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("sskim", 27),
                new Person("lsw", 27),
                new Person("lsy", 27));

        Person result1 = personList.stream()
                .filter(s -> "sskim".equals(s.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result1);

        Person result2 = personList.stream()
                .filter(s -> "hsh".equals(s.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

    }
}
