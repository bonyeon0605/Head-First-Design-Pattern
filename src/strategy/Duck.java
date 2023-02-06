package strategy;

public abstract class Duck {

    FlyBeHaivor flyBeHaivor;
    QuackBeHaivor quackBeHaivor;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBeHaivor.fly();
    }

    public void performQuack() {
        quackBeHaivor.quack();;
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

    public void setFlyBeHaivor(FlyBeHaivor fb) {
        flyBeHaivor = fb;
    }

    public void setQuackBeHaivor(QuackBeHaivor qb) {
        quackBeHaivor = qb;
    }

}
