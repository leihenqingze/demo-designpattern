package c02.demo1;

public interface Observer {

    /**
     * 有所的观察者都必须实现update()，以实现观察者接口
     * 当气象观测值改变时，主题会把这些状态值当做方法的参数，传递给观察者。
     */
    void update(float temp,float humidity,float pressure);

}