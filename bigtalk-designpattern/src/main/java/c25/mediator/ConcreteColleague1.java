package c25.mediator;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    /**
     * 发送信息时通常是中介者发送出去的
     */
    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMessage(String message) {
        System.out.println("同事1得到信息：" + message);
    }

}