package designpattern.factorymethod;

public class Cat extends Animal {

    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}