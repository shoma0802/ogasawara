package lesson25;

public class Lesoon25Sub extends Theme2 {
    public Lesoon25Sub(String name) {
        super(name);
    }
    
    public void displayStatus() {
        // スーパークラスのdisplayStatusメソッドの呼び出し
        super.displayStatus();
        // プレイヤーの名前、HP、MP、攻撃力、素早さ、防御力を表示する
        System.out.println("");
    }

    public static void main(String[] args) {
        // プレイヤーを生成し、ステータスを表示する
        Lesoon25Sub player = new Lesoon25Sub("山田太郎");
        player.displayStatus();
    }
}

