package forEachExample;

import java.util.ArrayList;
import java.util.List;

public class forEachListExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        System.out.println("=====Normal loop=====");
        for (String item : items) {
            System.out.println(item);
        }

        //lambda
        //Output : A,B,C,D,E
        System.out.println("=====lambda=====");
        items.forEach(item -> System.out.println(item));

        //Output : C
        items.forEach(item -> {
            if ("C".equals(item)) {
                System.out.println(item);
            }
        });

        //method reference
        //Output : A,B,C,D,E
        System.out.println("=====Method reference=====");
        items.forEach(System.out::println);

        //Stream and filter
        //Output : B
        System.out.println("=====Stream andn filter=====");
        items.stream()
                .filter(sskim -> sskim.contains("B"))
                .forEach(System.out::println);
    }
}
