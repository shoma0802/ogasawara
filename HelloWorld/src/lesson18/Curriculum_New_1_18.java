package lesson18;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
    //メソッド
    public static void printHello(String str, int num) {
        System.out.println("Hello " + str + " " + num);
    }

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
    
    // Q2のメソッド
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		
    // Q3のメソッド
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	
    //Q4    
    // Q2のオーバーロード
    public static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
    
    // Q5
    public static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(100) + 1;
            nums[i] = num;
            System.out.println(num);
        }
        return nums;
    }

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
    
    // Q6
    public static double calculateAverage(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    
    // Q7
    public static boolean isGreaterThan50(double num) {
        return num >= 50;
    }

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		
		// Q1のメソッド呼び出し
		 printHello("JavaSE", 11); 
		 
		// Q2のメソッド呼び出し
	     multiply(2, 5); 
	     int[] nums = {1, 2, 3};
	     
	    // Q3のメソッド呼び出し
	     printArray(nums); 
	     
	     multiply(3, 5);

	    // Q4の呼び出し
	     add(1.2, 3.4);

	    // Q5の呼び出し
	     int[] nums1 = generateRandomNumbers(5);
	     for (int num : nums1) {
	     System.out.println(num);
	     }

	    // Q6の呼び出し
	     double average = calculateAverage(nums1);
	     System.out.println("Average: " + average);

	    // Q7の呼び出し
	     boolean result = isGreaterThan50(average);
	     System.out.println("Result: " + result);
	}
}