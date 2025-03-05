package thread.start;

import static util.MyLogger.log;

import thread.start.InnerRunnableMainV1.MyRunnable;

public class InnerRunnableMainV3 {
  public static void main(String[] args) {
    log("main() start");

    // 익명 클래스를 파라미터 안에 구현하기
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        log("run()");
      }
    });
    thread.start();

    log("main() end");
  }
}
