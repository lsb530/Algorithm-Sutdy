package designpattern.adapter;

public class ClientWithAdapter {

    public static void main(String[] args) {
//        ServiceA sa1 = new ServiceA();
//        ServiceB sb1 = new ServiceB();

        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();
//        sa1.runServiceA();
//        sb1.runServiceB();
        asa1.runService();
        asb1.runService();
    }
}