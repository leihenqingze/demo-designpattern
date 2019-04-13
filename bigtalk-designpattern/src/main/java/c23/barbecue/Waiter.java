package c23.barbecue;

import lombok.Setter;

/**
 * 服务员类，不用管用户想要什么烤肉，反正都是'命令'，只管记录订单，然后通知'烤肉串者'执行即可
 */
public class Waiter {

    @Setter
    private Command command;

    public void notifyCommand() {
        command.excuteCommand();
    }

}
