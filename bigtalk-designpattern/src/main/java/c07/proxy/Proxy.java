package c07.proxy;

import java.util.Objects;

//保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，
// 这样代理就可以用来替代实体
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (Objects.isNull(realSubject)) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }

}