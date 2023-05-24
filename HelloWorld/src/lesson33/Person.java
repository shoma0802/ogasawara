package lesson33;

class Person {
    public static int count = 0; 
    public String firstName; 
    public String lastName; 
    public int age; 
    public double height, weight; 

    Person(String firstName, int age, double height, double weight) {
        Person.count++; // 問題3: インスタンス生成ごとに合計人数をインクリメント
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    Person(String firstName, String lastName, int age, double height, double weight) {
        this(firstName, age, height, weight); 
        this.lastName = lastName; // 問題2: lastNameフィールドの値をセット
    }

    public String fullName() {
        return this.firstName + " " + this.lastName; 
    }

    public void print() {
        System.out.println("名前は" + this.fullName() + "です"); 
        System.out.println("年は" + this.age + "才です"); 
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public static void printCount() {
        System.out.println("合計" + Person.count + "人です"); 
    }
}