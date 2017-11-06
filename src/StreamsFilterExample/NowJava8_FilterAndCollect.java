package StreamsFilterExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8_FilterAndCollect {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "java", "sskim");

        List<String> result = lines.stream()
                .filter(line -> "sskim".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
