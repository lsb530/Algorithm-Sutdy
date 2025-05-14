package practice;

public class 동물 {
    String myClass;

    public 동물() {
        this.myClass = "동물";
    }

    void showMe() {
        System.out.println(myClass);
    }
}

class 포유류 extends 동물 {

    public 포유류() {
        myClass = "포유류";
    }
}

class 조류 extends 동물 {

    public 조류() {
        myClass = "조류";
    }
}