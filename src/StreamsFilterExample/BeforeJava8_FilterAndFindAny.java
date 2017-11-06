package StreamsFilterExample;

import java.util.Arrays;
import java.util.List;

public class BeforeJava8_FilterAndFindAny {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("sskim", 27),
                new Person("lsw", 27),
                new Person("lsy", 27));

        Person result = getStudentsName(personList, "sskim");
        System.out.println(result);

    }

    private static Person getStudentsName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
}
