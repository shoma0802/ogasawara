package lesson30;

class Person {
    String name;
    int age;
    double height;
    double weight;
    // クラス変数（人数の合計）
    static int count = 0; 

    // コンストラクタ
    Person(String name, int age, double height, double weight) {
    	// 名前をセット
        this.name = name; 
        // 年齢をセット
        this.age = age;
        // 身長をセット
        this.height = height; 
        // 体重をセット
        this.weight = weight; 
        // 人数の合計をインクリメント
        count++; 
    }

    // BMIを計算するメソッド
    double bmi() {
        return weight / (height * height);
    }

    // 情報を表示するメソッド
    void print() {
    	// 名前を表示
        System.out.println("名前は" + this.name + "です"); 
        // BMIを小数点第一まで表示
        System.out.printf("BMIは%.1fです\n", this.bmi());
        // 年齢を表示
        System.out.println("年は" + this.age + "才です"); 
    }
}