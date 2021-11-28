package edu.thread;

public class ThreadEx1 {
  public static void main(String[] args) {
    ThreadEx1_1 t1 = new ThreadEx1_1();

    // Runnable 인터페이스를 구현한 경우, Runnable 인터페이스를 구현한 클래스의 인스턴스를 생성한 다음, 이 인스턴스를 Thread 클래스의 생성자의 매개변수로 제공해야 한다
    Runnable r = new ThreadEx1_2();
    Thread t2 = new Thread(r);

    t1.start();
    t2.start();
  }
}

class ThreadEx1_1 extends Thread{
  @Override
  public void run() {
    for (int i=0; i<5; i++) {
      System.out.println(getName());
    }
  }
}

class ThreadEx1_2 implements Runnable {

  @Override
  public void run() {
    for (int i=0; i<5; i++) {
      // Thread.currentThread() - 현재 실행중인 Thread 반환
      System.out.println(Thread.currentThread().getName());
    }
  }
}