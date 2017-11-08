package StreamsMap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {
    public static void main(String[] args) {

        //기존 소문자 a를 대문자 a로 convert하는 상황
        List<String> alpha = Arrays.asList("a", "b", "c", "d", "e");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String str : alpha) {
            alphaUpper.add(str.toUpperCase());
        }

        System.out.println(alphaUpper);

        List<String> collect = alpha.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect);

        //객체 문자열 목록(이름) 가져오기
        List<Staff> staffList = Arrays.asList(
                new Staff("sskim", 20, new BigDecimal(10000)),
                new Staff("lsw", 25, new BigDecimal(15000)),
                new Staff("lsy", 30, new BigDecimal(20000)));

        //Java8 이전
        List<String> result = new ArrayList<>();
        for (Staff staff : staffList) {
            result.add(staff.getName());
        }
        System.out.println(result);

        //Java8
        List<String> collectName = staffList.stream()
                .map(x -> x.getName())
                .collect(Collectors.toList());
        System.out.println(collectName);

    }
}
