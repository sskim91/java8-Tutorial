package ConvertStringCharArray;

public class StringToCharArray {
    public static void main(String[] args) {

        String password = "password123";

        char[] passwordInCharArray = password.toCharArray();

        for (char temp : passwordInCharArray) {
            System.out.println(temp);
        }

        //Java8 Convert String to Stream Char

        password.chars() //IntStream
                .mapToObj(x -> (char) x)//Stream<Character>
                .forEach(System.out::println);
    }
}
