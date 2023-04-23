package lesson25;

public class Lesoon25Sub {
    public static void main(String[] args) {
    	//プレイヤーの名前を生成
    	Theme2 player = new Theme2("山田太郎");
    	
    	// プレイヤーの名前、HP、MP、攻撃力、素早さ、防御力を表示する
        System.out.println("こんにちは " + player.getName() + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp());
        System.out.println("MP：" + player.getMp());
        System.out.println("攻撃力：" + player.getAtk());
        System.out.println("素早さ：" + player.getSpd());
        System.out.println("防御力：" + player.getDef());
        System.out.println("さあ冒険に出かけよう！");
    }
}
