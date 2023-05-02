package lesson22Sub;
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
    // フィールドの定義
    private String greeting;
    private String sushiTaste;
    private String japaneseFood;
    private LocalDateTime currentDateTime;

    // コンストラクタ
    public Lesson22() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiTaste = "この寿司はうまい";
        this.japaneseFood = "寿司は和食です";
        this.currentDateTime = LocalDateTime.now();
    }

    // メソッドの定義
    public void sayHello() {
        System.out.println(this.greeting);
    }

    public void saySushiTastesGood() {
        System.out.println(this.sushiTaste);
    }

    public void japaneseFood() {
        System.out.println(this.japaneseFood);
    }

    public void showCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("今の現在日時は" + formatter.format(this.currentDateTime) + "です");
    }
}