package lesson32;

class Person {
    public String name;
    public int age;
    public double height; 
    public double weight;

    public static int count; // 問題1

    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        count++; // 問題2
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public void print() {
        System.out.println("名前は" + this.name + "です"); 
        System.out.println("年は" + this.age + "です"); 
    }

    public static void printCount() { // 問題4
        System.out.println("合計" + count + "人です"); // 問題5
    }
}
