package strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBeHaivor = new Quack();
        flyBeHaivor = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
