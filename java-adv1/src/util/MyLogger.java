package util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

  public static void log(Object obj) {
    String time = LocalTime.now().format(formatter);
    System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    // %s에 의해 obj 는 toString 을 자동으로 호출합니다.
  }
}
