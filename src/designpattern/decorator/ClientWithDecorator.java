package designpattern.decorator;

public class ClientWithDecorator {

    public static void main(String[] args) {
        Decorator decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}