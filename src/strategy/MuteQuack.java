package strategy;

public class MuteQuack implements QuackBeHaivor {
    @Override
    public void quack() {
        System.out.println("<< 조용~~ >>");
    }
}
