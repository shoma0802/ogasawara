package lesson33;

class Main {
    public static void main(String[] args) {
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        // person1の情報を表示
        person1.print();

        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        // person2の情報を表示
        person2.print();

        // 問題3: 合計人数を出力
        Person.printCount(); 
    }
}