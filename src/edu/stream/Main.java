package edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] arr = {"aaa","sss","ddd"};
        Stream<String> arrStream = Arrays.stream(arr);

        arrStream.forEach(System.out::println);


        String[] strArr = {"aaa","sss","ddd","fff","ggg","hhhh","ggg"};

        // 문자열 배열이 소스인 스트림
        Stream<String> stream = Stream.of(strArr);
        // 걸러내기
        Stream<String> filteredStream =  stream.filter(s -> s.length()%2 == 1);
        // 중복제거
        Stream<String> distinctedStream = stream.distinct();
        // 정렬
        Stream<String> sortedStream = stream.sorted();
        // 스트림 자르기
        Stream<String> limitedStream = stream.limit(3);
        long total = stream.count();

        System.out.println(total);

        
    }
}
