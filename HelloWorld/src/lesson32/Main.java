package lesson32;

class Main {
    public static void main(String[] args) {
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
        // 鈴木太郎の情報を表示
        person1.print();
  
        Person person2 = new Person("山田花子", 22, 1.5, 40);
        // 山田花子の情報を表示
        person2.print();
        
        // 問題6: 現在の「count」の値を表示
        Person.printCount(); 
    }
}