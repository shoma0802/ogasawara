/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package lesson25;

import java.util.Random;

public class Theme2 {
	// プレイヤーの名前、HP、MP、攻撃力、素早さ、防御力をフィールドとして宣言する
    private String name;
    private int hp;
    private int mp;
    private int atk;
    private int spd;
    private int def;

    // コンストラクタでプレイヤーの名前を設定し、ランダムな値で各ステータスを初期化する
    public Theme2(String name) {
        this.name = name;
        Random rand = new Random();
        this.hp = rand.nextInt(1000) + 1;
        this.mp = rand.nextInt(1000) + 1;
        this.atk = rand.nextInt(500) + 1;
        this.spd = rand.nextInt(1000) + 1;
        this.def = rand.nextInt(100) + 1;
    }
    
    // フィールドのゲッターとセッターを定義する
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    // ステータスを表示するメソッドを定義する
    public void displayStatus() {
    	// プレイヤーの名前、HP、MP、攻撃力、素早さ、防御力を表示する
    	System.out.println("こんにちは " + this.name + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + this.hp);
        System.out.println("MP：" + this.mp);
        System.out.println("攻撃力：" + this.atk);
        System.out.println("素早さ：" + this.spd);
        System.out.println("防御力：" + this.def);
        System.out.println("");
        System.out.println("さあ冒険に出かけよう！");
    }
  
    public static void main(String[] args) {
    	// プレイヤーを生成し、ステータスを表示する
        Theme2 player = new Theme2("山田太郎");
        player.displayStatus();
    }
}
