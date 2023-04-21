package lesson22;
/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson22 {
    //	それぞれのメソッドの定義
    public static void sayHello() {
        System.out.println("こんにちは！ここは日本です！");
    }

    public static void saySushiTastesGood() {
        System.out.println("この寿司はうまい");
    }

    public static void japaneseFood() {
        System.out.println("寿司は和食です");
    }

    public static void showCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("今の現在日時は" + formatter.format(now) + "です");
    }
}
