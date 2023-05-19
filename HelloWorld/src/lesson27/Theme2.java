/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
package lesson27;

public class Theme2 {
    public static void processInput(String input) {
        String[] animals = input.split(",");
        // 入力された文字列を動物ごとに分割して処理
        for (String animal : animals) {
        	// 動物の情報を分割
            String[] info = animal.split(":");
            String name = info[0];
            String length = info[1] + "m";
            String speed = info[2] + "km/h";
            String scientificName = "";
            // 動物の名前に応じて学名を設定
            switch (name) {
            	// 各動物の学名を設定
                case "ライオン":
                    scientificName = "パンテラ レオ";
                    break;
                case "ゾウ":
                    scientificName = "ロキソドンタ・サイクロティス";
                    break;
                case "パンダ":
                    scientificName = "アイルロポダ・メラノレウカ";
                    break;
                case "チンパンジー":
                    scientificName = "パン・トゥログロディテス";
                    break;
                case "シマウマ":
                    scientificName = "チャップマンシマウマ";
                    break;
                case "インコ":
                    scientificName = "不明";
                    break;
                default:
                    break;
            }
            // 動物の情報をコンソールに表示
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length);
            System.out.println("速度：" + speed);
            System.out.println("学名：" + scientificName);
            System.out.println();
        }
    }
}
