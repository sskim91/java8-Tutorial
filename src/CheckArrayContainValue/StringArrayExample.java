package CheckArrayContainValue;

import java.util.Arrays;
import java.util.List;

public class StringArrayExample {
    public static void main(String[] args) {

        String[] alphabet = new String[]{"A", "B", "C"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        if(list.contains("A")){
            System.out.println("Hello A");
        }

        //Java8
        boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
        if (result) {
            System.out.println("Hello A");
        }


    }
}
