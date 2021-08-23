package edu.lambda.example;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {};   // MyFunction2 f = (MyFunction2) ( () -> {} );
        Object obj = (MyFunction2)(() -> {});       // Casting to Object
        String str = ((Object)(MyFunction2)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);
        /*
        print
        -> edu.lambda.example.LambdaEx2$$Lambda$14/0x0000000800066840@5594a1b5

        일반적인 익명 객체라면 '외부클래스이름$번호'와 같은 형식으로 타입 결정
        BUT 람다식 타입은 '외부클래스이름$$Lambda$번호'와 같은 형식으로 결정

        * */
    }
}
