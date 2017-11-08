package CheckArrayContainValue;

import java.util.Arrays;
import java.util.List;

public class StringArrayExample2 {
    public static void main(String[] args) {

        String[] alphabet = new String[]{"A", "C"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        // A or B
        if (list.contains("A") || list.contains("B")) {
            System.out.println("Hello A or B");
        }

        // A and B
        if (list.containsAll(Arrays.asList("A", "B"))) {
            System.out.println("Hello A and B");
        }

        // A and C
        if (list.containsAll(Arrays.asList("A", "C"))) {
            System.out.println("Hello A and C");
        }

    }
}
