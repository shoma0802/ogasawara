package lesson19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog myDog = new Dog();
        System.out.println("動物の名前は「" + myDog.name + "」です。");
        
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog anotherDog = new Dog(3);
        System.out.println("動物の数は「" + anotherDog.count + "」匹です。");
        
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("現在の日時は「" + formattedDateTime + "」です。");
	}
}
