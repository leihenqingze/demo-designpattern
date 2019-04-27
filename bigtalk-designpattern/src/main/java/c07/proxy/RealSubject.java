package c07.proxy;

//定义Proxy代表的真实实体
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("真实的请求");
    }

}
