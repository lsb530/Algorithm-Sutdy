package designpattern.adapter;

public class AdapterServiceB {

    ServiceB sb1 = new ServiceB();

//    void runServiceA() {
    void runService() {
        sb1.runServiceB();
    }
}