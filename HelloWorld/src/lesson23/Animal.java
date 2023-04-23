package lesson23;
/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

public class Animal {
    private String name;
    private double length;
    private double speed;

    // セッター
    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // ゲッター 
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getSpeed() {
        return speed;
    }
}





