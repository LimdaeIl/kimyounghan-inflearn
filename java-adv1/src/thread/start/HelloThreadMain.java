package thread.start;

public class HelloThreadMain {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start"); // main: start()

    HelloThread thread = new HelloThread();
    System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
    thread.start(); // run() 이 아니라 start()를 호출해야 한다!
    System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

    System.out.println(Thread.currentThread().getName() + ": main() end"); // main: end()

  }
}
