package lesson5;

public class Sample {

    public static void main(String[] args) {
    	
        // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

    	// Q1を下記に記載
    	
//    	変数宣言と代入
        String name;
        name = "山田太郎";
        int age;
        age = 18;
        double height;
        height = 170.5;
        double weight;
        weight = 62.2;
        String favoriteFood;
        favoriteFood = "寿司";

//        favoriteFood = new String();
        
//        コンソールに出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです" );
        System.out.println("体重は" + weight + "kgです" );
        System.out.println("好きな食べ物は" + favoriteFood + "です" );
        

        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
//        BMIを求め、変数名bmiに代入
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("BMIは"+ bmi + "です");    
        
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
//    	変数に再代入
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";
        
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです" );
        System.out.println("体重は" + weight + "kgです" );
        System.out.println("好きな食べ物は" + favoriteFood + "です" );
//      BMIを求め、変数名bmi2に代入
        double bmi2 = weight / ((height / 100) * (height / 100));
        System.out.println("BMIは"+ bmi2 + "です"); 
    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
    	 
     }

}
