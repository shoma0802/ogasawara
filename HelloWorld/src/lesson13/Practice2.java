/*
	①配列aを作成し、1～5を格納してください。
	
	②参照型配列bを作成し、3を表示してください。
		出力結果：3
		
	③配列a[3]を10で上書きし表示してください。
		出力結果：10
		
	④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
		出力結果：配列aの要素数は、５です。
*/
package lesson13;

public class Practice2 {

    public static void main(String[] args) {
        // 配列aを作成し、1～5を格納
        int[] a = {1, 2, 3, 4, 5};

        // 参照型配列bを作成し、要素数3で初期化
        Integer[] b = new Integer[3];
        b[2] = a[2];

        // 参照型配列bの3番目の要素を表示
        System.out.println(b[2]);

        // 配列aの3番目の要素を10で上書きし表示
        a[2] = 10;
        System.out.println(a[2]);

        // 配列aの要素数を表示
        System.out.println("配列aの要素数は、" + a.length + "です。");
    }
}
