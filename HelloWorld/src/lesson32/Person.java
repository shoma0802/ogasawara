package lesson32;

class Person {
	//それぞれの情報のセット
    public String name;
    public int age;
    public double height; 
    public double weight;
    // 問題1: 静的変数「count」を定義
    public static int count; 

    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        // 問題2: インスタンスが生成されるごとに「count」をインクリメント
        count++; 
    }
    // BMIを計算するメソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public void print() {
        System.out.println("名前は" + this.name + "です"); 
        System.out.println("年は" + this.age + "です"); 
    }
    // 問題4: 静的メソッド「printCount()」を定義
    public static void printCount() { 
    	// 問題5: 現在の「count」の値を表示
        System.out.println("合計" + count + "人です"); 
    }
}