package designpattern.strategy;

public class Client {

    public static void main(String[] args) {
//        Strategy strategy = null;
        Soldier rambo = new Soldier();

//        strategy = new StrategyGun();
//        rambo.runContext(strategy);
        rambo.runContext(new StrategyGun());
        System.out.println();

//        strategy = new StrategySword();
//        rambo.runContext(strategy);
        rambo.runContext(new StrategySword());
        System.out.println();

//        strategy = new StrategyBow();
//        rambo.runContext(strategy);
        rambo.runContext(new StrategyBow());
        System.out.println();
    }
}