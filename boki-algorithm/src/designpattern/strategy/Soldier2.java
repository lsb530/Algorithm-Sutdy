package designpattern.strategy;

public class Soldier2 {
    private final Strategy strategy;

    public Soldier2(Strategy strategy) {
        this.strategy = strategy;
    }

    public void runContext() {
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}