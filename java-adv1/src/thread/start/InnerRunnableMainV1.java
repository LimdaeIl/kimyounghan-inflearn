package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {
  public static void main(String[] args) {
    log("main() start");

    MyRunnable myRunnable = new MyRunnable();
    Thread thread = new Thread(myRunnable);
    thread.start();

    log("main() end");
  }

  // 현재 클래스 안에서만 사용하게 된다면 이너 클래스로 생성하는 방법이 좋다!
  static class MyRunnable implements Runnable {

    @Override
    public void run() {
      log("run()");
    }
  }

}
