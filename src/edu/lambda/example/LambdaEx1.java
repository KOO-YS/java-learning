package edu.lambda.example;

/*
* 함수형 인터페이스는 오직 하나의 추상 메서드만 정의되어 있어야 한다
* -> 람다식 : 인터페이스 = 1:1 연결
* */
@FunctionalInterface
interface MyFunction {
    void run();      // public abstract void run();
}

public class LambdaEx1 {
    static void execute(MyFunction f) {   // 매개변수 타입이 MyFunction인 메소드
        f.run();
    }
    
    static MyFunction getMyFunction() {     // 반환타입이 MyFunction인 메소드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }
    static MyFunction getMyFunctionTest() {     // 반환타입이 MyFunction인 메소드
//        MyFunction f = () -> {};
//        return f;
        return () -> {};
    }

    public static void main(String[] args) {
        // 람다식으로 run() 메소드 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {     // public 필수!
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( () -> System.out.println("run()!!!"));
    }
}