package c07.proxy;

//定义了的RealSubject和Proxy共同接口，这样就在任何使用RealSubject的地方都可以使用Proxy
public interface Subject {

    void request();

}