package c12.facade;

public class Main {

    //由于Facade的作用，客户端可以根本不知道三个子系统类的存在
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

}
