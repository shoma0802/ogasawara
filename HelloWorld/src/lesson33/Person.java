package lesson33;

class Person {
	// 合計人数を保持する変数
    public static int count = 0; 
    public String firstName; 
    public String lastName; 
    public int age; 
    public double height, weight; 
    
    // インスタンスのフィールドを初期化するコンストラクタ
    Person(String firstName, int age, double height, double weight) {
    	// 問題3: インスタンス生成ごとに合計人数をインクリメント
        Person.count++; 
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    // インスタンスのフィールドを初期化し、lastNameフィールドの値をセットするコンストラクタ
    Person(String firstName, String lastName, int age, double height, double weight) {
        this(firstName, age, height, weight); 
        // 問題2: lastNameフィールドの値をセット
        this.lastName = lastName; 
    }
    
    // フルネームを返すメソッド
    public String fullName() {
        return this.firstName + " " + this.lastName; 
    }
    
    // 名前と年齢を表示するメソッド
    public void print() {
        System.out.println("名前は" + this.fullName() + "です"); 
        System.out.println("年は" + this.age + "才です"); 
    }

    // BMIを計算して返すメソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    // 合計人数を表示するメソッド
    public static void printCount() {
        System.out.println("合計" + Person.count + "人です"); 
    }
}
