package edu.lambda.example;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
//        메소드 참조 : 람다식이 하나의 메소드만 호출하는 경우 간략히 표현
//        Function<Integer, String> g = Integer::toBinaryString;

        Function<String, String> h = f.andThen(g);      // f 수행 후 g 수행
        Function<Integer, Integer> h2 = f.compose(g);   // g 수행 후 f 수행

        System.out.println(h.apply("FF"));  // FF -> 255 -> 11111111
        System.out.println(h2.apply(2));    // 2 -> 10 -> 16

        Function<String, String> f2 = x -> x;       // 항등함수 (* 잘 사용되지 않으며, map() 변환 작업 시 변환 없이 그대로 처리하고자 할 때 사용)
        System.out.println(f2.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate();       // i > 100 (* negate() : 조건식 전체 부정)

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));

        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}
