/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package lesson15;

public class Practice {

	public static void main(String[] args) {
		int[][] test = {
		        {64, 73, 69},
		        {58, 81, 75},
		        {86, 68, 79},
		        {72, 55, 80}
		    };

		for(int i=0; i<test.length; i++){
		    System.out.printf("生徒%d：国語%d点、数学%d点、英語%d点\n",
		                      i+1, test[i][0], test[i][1], test[i][2]);
		}
		
		// 国語、数学、英語の成績の合計値を初期化
		int sumJapanese = 0, sumMath = 0, sumEnglish = 0;

		// 合計値を計算
		for (int i = 0; i < test.length; i++) {
		    sumJapanese += test[i][0];
		    sumMath += test[i][1];
		    sumEnglish += test[i][2];
		}

		// 平均値を計算
		double averageJapanese = (double) sumJapanese / test.length;
		double averageMath = (double) sumMath / test.length;
		double averageEnglish = (double) sumEnglish / test.length;

		// 平均値を表示
		System.out.printf("国語の平均点は%.1f点です。\n", averageJapanese);
		System.out.printf("数学の平均点は%.1f点です。\n", averageMath);
		System.out.printf("英語の平均点は%.1f点です。\n", averageEnglish);


	}

}
