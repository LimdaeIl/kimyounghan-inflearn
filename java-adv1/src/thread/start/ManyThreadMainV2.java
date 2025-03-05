package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV2 {
  public static void main(String[] args) {
    log("main() start");

    HelloRunnable helloRunnable = new HelloRunnable();

    for (int i = 0; i < 100; i++) { // 스레드의 실행 순서는 알 수 없다! 운영체제 마음이다!
      Thread thread = new Thread(helloRunnable);
      thread.start();
    }

    log("main() end");


  }
}
