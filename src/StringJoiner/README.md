## 1.StringJoiner 

1.1 구분자로 문자열 결합

```java
StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("aaa");
        stringJoiner.add("bbb");
        stringJoiner.add("ccc");
        String result = stringJoiner.toString();
        System.out.println(result);
``` 
<pre>
aaa,bbb,ccc
</pre>

1.2 문자열을 구분자로 결합하고 접두어(prefix) 접미어(suffix) 추가
```java
stringJoiner = new StringJoiner("/", "prefix-", "-suffix");
        stringJoiner.add("2017");
        stringJoiner.add("11");
        stringJoiner.add("09");
        System.out.println(stringJoiner.toString());
```
<pre>
prefix-2017/11/09-suffix
</pre>

## 2.String.join

2.1 구분자로 문자열 결합 

```java
String str = String.join("-", "2017", "11", "09" );
        System.out.println(str);
```
<pre>
2017-11-09
</pre>

2.2 리스트 구분자 결합
```java
List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");  
        String result2 = String.join(", ", list);
        System.out.println(result2);
```
<pre>
java, python, nodejs, ruby
</pre>

## 3. Collectors.joining

```java
String result3 = list.stream().map(x -> x)
                .collect(Collectors.joining(" | "));
        System.out.println(result3);
```
<pre>
java | python | nodejs | ruby
</pre>

리스트 객체 문자열 결합
```java
List<Game> gameList = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        String result4 = gameList.stream()
                .map(x -> x.getName())
                .collect(Collectors.joining(", ", "{", "}"));

        System.out.println(result4);
```
```diff
{Dragon Blaze, Angry Bird, Candy Crush}
```