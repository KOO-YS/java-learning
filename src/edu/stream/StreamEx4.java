package edu.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        // 문자열 배열(Stringp[) 스트림
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "ghi"},
                new String[]{"ABC", "GHI", "JKL"}
        );

//        Stream<Stream<String>> strStrStream = strArrStream.map(Arrays::stream);
        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
            "Believe or not It is true",
            "Do or do not There is no try",
        };
        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        Stream<String> strStream1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> strStream2 = Stream.of("bbb", "aaa", "ccc", "dd");

        Stream<Stream<String>> strStrmStrm = Stream.of(strStream1, strStream2);
        Stream<String> strStrm = strStrmStrm
                .map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);
        strStrm.map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);
    }
}
