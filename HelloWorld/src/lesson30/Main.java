package lesson30;

class Main {
	  public static void main(String[] args) {
	    Person person1 = new Person("鈴木太郎", 20, 1.73, 60);
	    // 情報を表示
	    person1.print();
	    // 人数の合計を表示
	    System.out.println("合計" + Person.count + "人です"); 
	  }
	}

