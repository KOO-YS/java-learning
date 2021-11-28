# Thread
<br>



### Process

- 실행 중인 프로그램(program)

- 프로그램을 실행하면 OS로부터 실행에 필요한 자원(메모리)를 할당받아 프로세스가 된다

- 프로세스의 구성

  - 프로그램을 수행하는 데 필요한 데이터
  - 메모리 등 자원
  - 스레드

- **Thread** : 프로세스의 자원을 이용해 실제로 작업을 수행

- 모든 프로세스는 최소 하나 이상의 스레드가 존재

  - multi-threaded process : 둘 이상의 스레드를 가진 프로세스

- 하나의 프로세스가 가질 수 있는 스레드의 개수는 제한되지 않음

  > BUT 
  > 스레드가 작업을 수행하는데 개별적인 메모리 공간(호출 스택)을 필요로 하기 때문에,
  > 프로세스의 메모리 한계에 따라 생성할 수 있는 스레드 수가 결정

<br>



#### multi-tasking vs multi-threading

- window, unix 등 대부분의 OS는 멀티태스킹을 지원 -> 여러 개의 프로세스가 동시에 실행
- 멀티스레딩 : 하나의 프로세스 내에서 여러 스레드가 동시에 수행 
  - CPU의 코어는 한 번에 하나의 작업만 수행할 수 있으므로, 실제로 동시 처리되는 작업의 개수는 코어의 개수와 일치
  - `처리해야하는 스레드 수 >>> 코어의 개수`이기에, 아주 짧은 시간 동안 여러 작업을 번갈아 가며 수행함으로써 여러 작업들이 모두 동시에 수행되는 것처럼 보이게 한다
  - 그렇기 때문에 프로세스의 성능을 단순히 스레드 개수에 비례시키면 안된다

<br>



#### multi-threading의 장단점

:heavy_plus_sign:

- CPU 사용률을 향상시킨다
- 자원 효율적 사용
- 사용자에 대한 응답성 향상
- 작업이 분리되어 코드 간결

:heavy_minus_sign:

- 여러 스레드가 같은 프로세스 내에서 자원을 공유하면서 작업을 하기 때문에 발생할 수 있는 **동기화**, **교착상태**같은 문제들 고려해야 함

<br>



### 스레드 구현과 실행

#### 스레드 구현 방법

- Thread 클래스 상속받는 방법

  ```java
  class MyThread extends Thread {
      public void run() { /*overriding*/ }
  }
  ```

- Runnable 인터페이스를 구현하는 방법 

  ```java
  class MyThread implements Runnable {
      public void run() { /*implementing*/ }
  }
  
  // Runnable 인터페이스를 구현한 경우, Runnable 인터페이스를 구현한 클래스의 인스턴스를 생성한 다음, 이 인스턴스를 Thread 클래스의 생성자의 매개변수로 제공해야 한다
  ```

> Thread를 상속받으면 다른 클래스를 상속받을 수 없기 때문에, Runnable 인터페이스를 구현하는 방법이 일반적
>
> - 재사용성을 높이고
> - 코드의 일관성을 유지할 수 있기에
>
> 객체지향적인 방법이라 말할 수 있다

<br>



in Thread.class 구조 확인해보기

```java
public class Thread implements Runnable {
	// ...
    
    /* What will be run. */
    private Runnable target;

    // construnctor
    public Thread(Runnable target) {
        this(null, target, "Thread-" + nextThreadNum(), 0);
        // thread의 이름은 지정하지 않으면 "Thread-번호"의 형식으로 정해진다
    }

    // run
    @Override
    public void run() {
        if (target != null) {
            target.run();	// Runnable 인터페이스의 run()이 호출된다
        }
    }
    
    // ...
}
```

- 상속을 통해 run()을 오버라이딩하지 않더라도 외부로 부터 run()을 제공받을 수 있게 된다 

- **Thread를 직접 상속**받으면, 자손 클래스에서 조상인 **Thread 클래스의 메소드를 직접 호출**할 수 있지만,
  **Runnable을 구현**하면 **Thread 클래스의 static 메소드인 currentThread()를 호출**하여 스레드에 대한 참조를 얻어 호출 가능하다

<br>



#### 스레드의 실행

- 스레드를 생성했다고 자동으로 실행되는 것이 아닌, start()를 호출해야만 스레드가 실행
  - 바로 실행 X, 실행 대기 상태에 있다가 자신의 차례가 되어야 실행된다
  - 실행 순서는 OS의 스케쥴러가 작성한 스케쥴에 의해 결정

- 한 번 실행이 종료된 스레드는 다시 실행할 수 없다

  - 하나의 스레드에 대해 start()가 한 번만 호출될 수 있다

  - ##### 만일 스레드 작업을 한 번 더 수행해야 한다면?

    ```java
    ThreadEx1_1 t1 = new ThreadEx1_1();
    t1.start();
    
    t1 = new ThreadEx1_1();	// 다시 생성 
    // -> 다시 생성하지 않고 start() 두 번 호출 시, IllegalThreadStateException 발생 
    t1.start();
    ```

<br>



#### start()와 run()
