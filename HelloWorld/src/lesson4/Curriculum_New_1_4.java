package lesson4;

public class Curriculum_New_1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    	 
		     // Q1 下記9個をクラス変数として宣言のみしてください
		     //		・バイト型・短整数型・整数型・長整数型
		     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
		     //   	・文字型・文字列型
		     //	 	・ブーリアン型 
		
//		変数宣言
	    	 byte byte1;
	    	 short short1;
	    	 int int1;
	    	 long long1;
	    	 float float1;
	    	 double double1;
	    	 char char1;
	    	 String string1;
	    	 boolean boolean1;
	    	 
	    	 
		     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
	    	 
//	    	 変数の代入と初期化
	    	 byte1 = 0;
	    	 short1 = 0;
	    	 int1 = 0;
	    	 long1 = 0;
	    	 float1 = 1.0f;
	    	 double1 = 1.0;
	    	 char1 = 'a';
	    	 string1 = "";
	    	 boolean1 = false;


		     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		
		     // ・バイト型                 10
		     // ・短整数型                 100
		     // ・整数型                	 1000
		     // ・長整数型                 10000
		     // ・単精度浮動小数点数型   	 9.5
		     // ・倍精度浮動小数点数型		 10.5
		     // ・文字型                   a
		     // ・文字列型              	 ハロー
		     // ・ブーリアン型          	 true
	    	 
//	    	変数の代入 
	    	byte1 = 10;
		    
	    	short1 = 100;

	    	int1 = 1000;

	    	long1 = 10000;

	    	float1 = 9.5f;

	        double1 = 10.5;

	    	char1 = 'a';

	    	string1 = "ハロー";

	    	boolean1 = true;
		     // Q4 下記の通りにコンソール出力されるようにしてください
		     // 必ず変数を使用すること
		
		     // 11110
		     // 20.0
		     // a ハロー true
		     // 11130.0                    数字を全て足す
		     // 10000000000                小数点以外の数字を全てかける
		     // 0.105                      10.5割る100をする
		     // -90                        10引く100をする
	    	
//	    	コンソールに出力
	    	System.out.println (byte1 + short1 + int1 + long1);
	    	System.out.println (float1 + double1);
	    	System.out.println (char1 + string1 + boolean1);
	    	System.out.println (byte1 + short1 + int1 + long1 + float1 + double1);
	    	System.out.println (long1 * 1000000);
	    	System.out.println (double1 / 100);
	    	System.out.println (byte1 - 100);
	    	
	    	// Q5 
	    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
	    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	    	String num = "20";
	    	int num1 = 23;
//	    	num変数の値を整数型に変換
	    	System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

	}

}