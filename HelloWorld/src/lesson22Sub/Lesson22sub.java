package lesson22Sub;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson22sub {
  // インスタンス変数を定義
  String hello = "こんにちは！";
  String location = "ここは日本です！";
  String sushi = "この寿司はうまい寿司は和食です";
  
  //helloフィールドの値を出力するメソッド
  public void printHello() {
    System.out.println(this.hello);
  }
  
  //locationフィールドの値を出力するメソッド
  public void printLocation() {
    System.out.println(this.location);
  }
  
  //sushiフィールドの値を出力するメソッド
  public void printSushi() {
    System.out.println(this.sushi);
  }
  
  // 現在時刻を取得し、指定されたフォーマットで出力するメソッド
  public void printCurrentTime() {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);
    System.out.println("今の現在日時は" + formattedDateTime + "です");
  }
}