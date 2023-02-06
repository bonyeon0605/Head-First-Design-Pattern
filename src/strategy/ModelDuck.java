package strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBeHaivor = new FlyNoWay();
        quackBeHaivor = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
