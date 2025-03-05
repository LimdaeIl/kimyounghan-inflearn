package thread.start;

import static java.lang.Thread.*;

public class DaemonThreadMain {
  public static void main(String[] args) {
    System.out.println(currentThread().getName() + ": main() start");
    DaemonThread daemonThread = new DaemonThread();
    daemonThread.setDaemon(true); // 데몬 스레드 여부를 설정한다. true 설정하면 데몬 스레드이다.
    daemonThread.start();

    System.out.println(currentThread().getName() + ": main() end");
  }

  static class DaemonThread extends Thread {

    @Override
    public void run() {
      System.out.println(currentThread().getName() + ": run()");

      try { // throws 로 예외 밖으로 던질 수 없다! 부모 메서드가 예외를 정의하지 않기 때문이다.
        sleep(1000); // 10초간 실행
        System.out.println(currentThread().getName() + ": run() false");
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
