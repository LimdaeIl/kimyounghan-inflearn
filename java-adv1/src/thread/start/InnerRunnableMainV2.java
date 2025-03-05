package thread.start;

import static util.MyLogger.log;

import thread.start.InnerRunnableMainV1.MyRunnable;

public class InnerRunnableMainV2 {
  public static void main(String[] args) {
    log("main() start");

    // 익명 클래스로 생성해서 구현하기
    MyRunnable myRunnable = new MyRunnable() {
      @Override
      public void run() {
        log("main()");
      }
    };

    Thread thread = new Thread(myRunnable);
    thread.start();

    log("main() end");
  }
}
