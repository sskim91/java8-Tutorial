package StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("aaa");
        stringJoiner.add("bbb");
        stringJoiner.add("ccc");
        String result = stringJoiner.toString();
        System.out.println(result);

        stringJoiner = new StringJoiner("/", "prefix-", "-suffix");
        stringJoiner.add("2017");
        stringJoiner.add("11");
        stringJoiner.add("09");
        System.out.println(stringJoiner.toString());

        String str = String.join("-", "2017", "11", "09" );
        System.out.println(str);

        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        //java, python, nodejs, ruby
        String result2 = String.join(", ", list);
        System.out.println(result2);

        String result3 = list.stream().map(x -> x).collect(Collectors.joining(" | "));
        System.out.println(result3);

        List<Game> gameList = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        String result4 = gameList.stream()
                .map(x -> x.getName())
                .collect(Collectors.joining(", ", "{", "}"));

        System.out.println(result4);
    }
}
