package c25.mediator;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMessage(String message) {
        System.out.println("同事2得到信息：" + message);
    }

}