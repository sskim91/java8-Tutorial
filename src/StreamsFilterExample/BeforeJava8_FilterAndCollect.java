package StreamsFilterExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8_FilterAndCollect {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "java", "sskim");
        List<String> result = getFilterOutput(lines, "mkyong");
        for (String temp : result) {
            System.out.println(temp);    //output : spring, java
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"sskim".equals(line)) {
                result.add(line);
            }
        }
        return result;
    }
}
