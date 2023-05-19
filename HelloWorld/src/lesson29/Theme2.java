/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */
 package lesson29;

import java.util.Arrays;
import java.util.Scanner;

public class Theme2 {
    public static void main(String[] args) {
        Lesson29Sub[] prefectures = {
                new Lesson29Sub("北海道", "札幌市", 83424),
                new Lesson29Sub("青森県", "青森市", 9646),
                new Lesson29Sub("岩手県", "盛岡市", 15275),
                new Lesson29Sub("宮城県", "仙台市", 7282),
                new Lesson29Sub("秋田県", "秋田市", 11638),
                new Lesson29Sub("山形県", "山形市", 9323),
                new Lesson29Sub("福島県", "福島市", 13784),
                new Lesson29Sub("茨城県", "水戸市", 6097),
                new Lesson29Sub("栃木県", "宇都宮市", 6408),
                new Lesson29Sub("群馬県", "前橋市", 6362),
                new Lesson29Sub("埼玉県", "さいたま市", 3798)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("都道府県番号をカンマ区切りで入力してください（例: 8,5,9）：");
        String input = scanner.nextLine();

        String[] inputArray = input.split(",");
        int[] indexArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            indexArray[i] = Integer.parseInt(inputArray[i].trim());
        }

        System.out.print("昇順(1)か降順(2)かを入力してください：");
        int order = scanner.nextInt();
        scanner.close();

        Arrays.sort(indexArray);
        if (order == 2) {
            reverseArray(indexArray);
        }

        for (int index : indexArray) {
        	Lesson29Sub prefecture = prefectures[index];
            System.out.printf("\n都道府県名：%s\n県庁所在地：%s\n面積：%skm2\n", prefecture.getName(), prefecture.getCapital(), prefecture.getArea());
        }
    }

    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}