
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

package lesson22;
import lesson22Sub.Lesson22sub;

public class Lesson22 {
  public static void main(String[] args) {
	// lesson22Subクラスのインスタンスを作成して、各メソッドを呼び出す
	Lesson22sub sub = new Lesson22sub();
    sub.printHello();
    sub.printLocation();
    sub.printSushi();
    sub.printCurrentTime();
  }
}

