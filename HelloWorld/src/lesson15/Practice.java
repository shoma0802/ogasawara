package lesson15;
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
public class Practice {
    public static void main(String[] args) {
        int[][] test = {
            {64, 73, 69},
            {58, 81, 75},
            {86, 68, 79},
            {72, 55, 80}
        };
        
        // 生徒の成績を表示する
        for (int i = 0; i < test.length; i++) {
            System.out.println("生徒" + (i + 1) + "：" + "国語" + test[i][0] + "点、" 
            								    + "数学" + test[i][1] + "点、" 
            								    + "英語" + test[i][2] + "点");
        }
        
        // 各教科の合計点と平均点を計算し、コンソールに出力する
        String[] subjects = {"国語", "数学", "英語"};
        int[] subjectTotals = new int[3];
        int numStudents = test.length;
        
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                subjectTotals[j] += test[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            int subjectAverage = Math.round((float) subjectTotals[i] / numStudents);
            System.out.println(subjects[i] + "の平均点は" + subjectAverage + "点です。");
        }
    }
}
