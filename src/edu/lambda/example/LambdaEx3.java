package edu.lambda.example;

import java.util.function.Predicate;

@FunctionalInterface
interface MyFunction3 {
    void myMethod();
}
class Outer {
    int val = 10;       // Outer.this.val

    class Inner {
        int val = 20;       // this.val

        void method(int i) {    // void method(final int i)
            int val = 30;       // final int val = 30;
            
//            i = 10; // WHY?? Error java: local variables referenced from a lambda expression must be final or effectively final 
            // 람다식 내에서 참조하고 있는 지역변수는 상수로 간주

            /* 람다 식 내에서 외부에 선언된 변수에 접근하는 방법 */
            MyFunction3 f = () -> {
//            MyFunction3 f = (i) -> {      // ERROR : 외부 지역변수와 같은 이름의 람다식 매개변수는 허용되지 않는다
                System.out.println("i : "+i);
                System.out.println("val : "+val);
                System.out.println("this.val : "+ this.val);
                System.out.println("Outer.this.val : "+ Outer.this.val);
            };
            f.myMethod();
        }
    }   // end Inner class
}       // end Outer class
public class LambdaEx3 {
    public static void main(String[] args) {
        /*
         * java.util.function 패키지
         * 일반적으로 자주 쓰이는 형식의 메소드를 함수형 인터페이스로 미리 정의
         * 매번 새로운 함수형 인터페이스를 정의하지 말고, 가능하면 이 패키지의 인터페이스를 활용하는 것이 좋다
         *
         * -> 매개변수 & 반환값의 유무에 따라 4개의 함수형 인터페이스 정의 (+ 변형으로 Predicate -> 반환타입 : boolean)
         * */
        Predicate<String> isEmptySet = s -> s.length() == 0;        // 매개변수 s를 가지고 s의 길이가 0 인지 아닌지 T/F
        String s = "";
        if(isEmptySet.test(s)) {        // means if(s.length() == 0)
            System.out.println("this is an empty String");
        }
    }
}
