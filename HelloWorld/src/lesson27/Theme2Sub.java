package lesson27;
import java.util.Scanner;


public class Theme2Sub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //コンソールに文字を入力してもらう
        System.out.println("コンソールに文字を入力してください");
        // 入力を取得
        String input = scanner.nextLine();
        // Theme2クラスのprocessInputメソッドを呼び出して入力を処理する
        Theme2.processInput(input);
        scanner.close();
    }
}


