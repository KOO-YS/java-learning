package edu.lambda.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
        Consumer<Integer> c = i -> System.out.print(i+", ");
        Predicate<Integer> p = i -> i%2==0;
        Function<Integer, Integer> f = i -> i/10*10;    // i의 1의자리를 없앤다
        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);

    }
    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<>(list.size());

        for(T i : list) {
            newList.add(f.apply(i));        // Function<T, Return> f의 람다식 값 (매개변수 1개-> generic 두번째는 리턴값임을 주의)
        }
        return newList;
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i=0; i<10; i++) {
            list.add(s.get());              // Supplier<T> s의 람다식 값 (매개변수 X)
        }
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for (T i : list) {
            if (p.test(i))      // Predicate<T>의 람다식의 참/거짓 (반환값 boolean) (매개변수 O)
                c.accept(i);    // Consumer<T>의 람다식 (반환값 없음) (매개변수 O)
        }
        System.out.println("]");
    }
}
