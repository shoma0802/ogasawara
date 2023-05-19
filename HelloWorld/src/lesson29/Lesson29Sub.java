package lesson29;

public class Lesson29Sub {
    private String name;
    private String capital;
    private int area;

    public Lesson29Sub(String name, String capital, int area) {
    	//それぞれの情報の設定
        this.name = name;
        this.capital = capital;
        this.area = area;
    }
    //それぞれのデータの取得
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getArea() {
        return area;
    }
}