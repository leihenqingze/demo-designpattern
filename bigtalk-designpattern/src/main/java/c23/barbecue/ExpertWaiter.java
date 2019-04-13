package c23.barbecue;

import com.google.common.collect.Lists;

import java.time.LocalDateTime;
import java.util.List;

public class ExpertWaiter {

    //存放具体命令的容器
    private List<Command> orders = Lists.newArrayList();

    //设置订单
    public void setOrder(Command command) {
        //在客户提出请求时，对没货的烧烤进行回绝
        if (command.toString() == "命令模式.BakeChickenWingCommand") {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            orders.add(command);
            //记录客户所点的烧烤的日志，以备算账收钱
            System.out.println("增加订单：" + command.toString() + " 时间：" + LocalDateTime.now());
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + " 时间：" + LocalDateTime.now());
    }

    //通知全部执行
    public void notifyCommand() {
        //根据用户点好的烧烤订单通知厨房制作
        for (Command command : orders) {
            command.excuteCommand();
        }
    }

}
