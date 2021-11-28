package designpattern.adapter;

public class AdapterServiceA {

    ServiceA sa1 = new ServiceA();

//    void runServiceA() {
    void runService() {
        sa1.runServiceA();
    }
}