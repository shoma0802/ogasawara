package lesson23;

@SuppressWarnings("unused")
public class Lion {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80.0);

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
