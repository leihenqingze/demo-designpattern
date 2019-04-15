package c25.mediator;

/**
 * 抽象中介者类
 */
public interface Mediator {

    /**
     * 定义一个抽象的发送消息方法，得到同事对象和发送信息
     */
    void send(String message, Colleague colleague);

}