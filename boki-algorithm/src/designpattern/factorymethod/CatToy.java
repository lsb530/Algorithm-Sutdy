package designpattern.factorymethod;

// 팩토리 메섣가 생성할 객체
public class CatToy extends AnimalToy {

    @Override
    void identify() {
        System.out.println("나는 캣타워! 고양이의 친구!");
    }
}