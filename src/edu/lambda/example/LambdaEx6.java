package edu.lambda.example;

import java.util.Arrays;
import java.util.function.*;

/*
* 이제껏의 함수형 인터페이스는 매개변수와 반환값의 타입이 모두 제네릭 타입 -> 기본형 타입의 값을 처리할 때도 Wrapper 클래스를 사용했다
* So, 당연히 기본형을 사용할 때보다 비효율적
* 
* 함수형 인터페이스의 효율적 처리를 위해 기본형 사용 함수형 인터페이스를 제공
* */
public class LambdaEx6 {
    public static void main(String[] args) {
        IntSupplier s = () -> (int)(Math.random()*100)+1;
        BooleanSupplier bs = () -> (int)(Math.random()*100)%2 == 0;
        IntConsumer c = i -> System.out.print(i + ", ");
        IntPredicate p = i -> i%2 == 0;
        // UnaryOperator, BinaryOperator는 Function의 또 다른 변형. 단, '매개변수'와 '반환타입'의 타입이 같아야 한다!!!
        IntUnaryOperator op = i -> i/10*10;
        // 만약 IntUnaryOperator 이 아니라, Function이면?
//        Function<Integer, Integer> f = i -> i/10%10; BUT 오토박싱&언박싱의 성능 저하

        int[] arr = new int[10];

        makeRandomList(s, arr);
        System.out.println(Arrays.toString(arr));
        printEvenNum(p, c, arr);
        int[] newArr = doSomething(op, arr);
        System.out.println(Arrays.toString(newArr));
    }

    static void makeRandomList(IntSupplier s, int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = s.getAsInt();      // get() X X X
        }
    }
    static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }
    static int[] doSomething(IntUnaryOperator op, int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i=0; i<newArr.length; i++) {
            newArr[i] = op.applyAsInt(arr[i]);  // apply()가 아님 주의!!
        }
        return newArr;
    }
}
