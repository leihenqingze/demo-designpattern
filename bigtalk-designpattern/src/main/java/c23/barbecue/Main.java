package c23.barbecue;

import org.junit.Test;

public class Main {

    /**
     * 客户端程序与'烤肉串者'紧耦合，尽管简单，但却极为僵化，有许多的隐患。
     */
    @Test
    public void tightCoupling() {

        Barbecue boy = new Barbecue();
        boy.bakeMutton();
        boy.bakeMutton();
        boy.bakeMutton();
        boy.bakeChickenWing();
        boy.bakeMutton();
        boy.bakeMutton();
        boy.bakeChickenWing();

    }

    @Test
    public void looseCoupling() {

        //开店前准备
        //烧烤店事先就找好了烤肉厨师、服务员和烤肉菜单，就等客户上门
        Barbecue boy = new Barbecue();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);

        //开门营业
        //服务员根据用户要求，通知厨房开始制作
        Waiter girl = new Waiter();
        girl.setCommand(bakeMuttonCommand1);
        girl.notifyCommand();
        girl.setCommand(bakeMuttonCommand2);
        girl.notifyCommand();
        girl.setCommand(bakeChickenWingCommand);
        girl.notifyCommand();

    }

    @Test
    public void looseCouplingAfter() {

        //开店前准备
        Barbecue boy = new Barbecue();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);

        //开门营业 顾客点餐
        ExpertWaiter girl = new ExpertWaiter();
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand);

        //订单下好后一次通知
        //点餐完毕，通知厨房
        girl.notifyCommand();

    }

}
