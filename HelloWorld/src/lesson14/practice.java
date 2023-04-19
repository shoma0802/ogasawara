
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package lesson14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		データの格納
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
//		eまでのアルファベットの表示
		for(String letter : alphabet){
		  if(letter.equals("e")){
		    break;
		  }
		  System.out.println(letter);
		}
// 		iをスキップしてi以外のデータの表示
		for(String letter : alphabet){
		  if(letter.equals("i")){
		    continue;
		  }
		  System.out.println(letter);
		}

	}

}
