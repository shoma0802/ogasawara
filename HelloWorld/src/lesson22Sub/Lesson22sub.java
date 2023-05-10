package lesson22Sub;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson22sub {
  String hello = "こんにちは！";
  String location = "ここは日本です！";
  String sushi = "この寿司はうまい寿司は和食です";
  
  public void printHello() {
    System.out.println(this.hello);
  }
  
  public void printLocation() {
    System.out.println(this.location);
  }
  
  public void printSushi() {
    System.out.println(this.sushi);
  }
  
  public void printCurrentTime() {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);
    System.out.println("今の現在日時は" + formattedDateTime + "です");
  }
}
