package designpattern.strategy;

public class Client2 {

    public static void main(String[] args) {
        Soldier2 man = new Soldier2(new StrategyGun());

        man.runContext();
        System.out.println();

        man = new Soldier2(new StrategySword());
        man.runContext();
        System.out.println();

        man = new Soldier2(new StrategyBow());
        man.runContext();
    }
}