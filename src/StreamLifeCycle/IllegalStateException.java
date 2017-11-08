package StreamLifeCycle;

import java.util.Arrays;
import java.util.stream.Stream;

public class IllegalStateException {
    public static void main(String[] args) {

        String[] array = {"a", "b", "c", "d", "e"};
        Stream<String> stream = Arrays.stream(array);

        //loop a stream
        stream.forEach(x-> System.out.println(x));

        //재사용시 오류 발생 IllegalStateException: stream has already been operated upon or closed
        long count = stream.filter(x-> "b".equals(x)).count();
        System.out.println(count);


    }
}
