package strategy;

public class FlyNoWay implements FlyBeHaivor {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요.");
    }
}
