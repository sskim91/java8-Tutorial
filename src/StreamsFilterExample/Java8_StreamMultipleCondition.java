package StreamsFilterExample;

import java.util.Arrays;
import java.util.List;

public class Java8_StreamMultipleCondition {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("sskim", 30),
                new Person("lsw", 20),
                new Person("lsy", 25));

        Person result1 = personList.stream()
                .filter((s) -> "sskim".equals(s.getName()) && s.getAge() == 30)
                .findAny()
                .orElse(null);

        System.out.println(result1);

    }
}
