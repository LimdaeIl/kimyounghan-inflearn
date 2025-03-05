package thread.start;

public class BadThreadMain {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start"); // main: start()

    HelloThread thread = new HelloThread();
    System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
    thread.run(); // run() 을 직접 실행...! main() Thread 가 직접 실행하는 문제! 그냥 일반 메서드 호출과 같다.
    System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

    System.out.println(Thread.currentThread().getName() + ": main() end"); // main: end()

  }
}
