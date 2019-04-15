package c25.mediator;

import lombok.Setter;

public class ConcreteMediator implements Mediator {

    /**
     * 需要了解所有的具体同事对象
     */
    @Setter
    private ConcreteColleague1 concreteColleague1;
    @Setter
    private ConcreteColleague2 concreteColleague2;

    /**
     * 重写发送消息的方法，根据对象做出选择判断，通知对象
     */
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague.equals(concreteColleague1)) {
            concreteColleague2.notifyMessage(message);
        } else {
            concreteColleague1.notifyMessage(message);
        }
    }

}