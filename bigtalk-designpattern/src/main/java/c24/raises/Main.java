package c24.raises;

import c24.raises.chainresponsibility.CommonManager;
import c24.raises.chainresponsibility.GeneralManager;
import c24.raises.chainresponsibility.Majordomo;
import org.junit.Test;

public class Main {

    @Test
    public void run() {

        Manager jinli = new Manager("金利");
        Manager zongjian = new Manager("宗剑");
        Manager zhongjingli = new Manager("钟精励");

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请假");
        request.setNumber(1000);
        jinli.getResult("经理", request);
        zongjian.getResult("总监", request);
        zhongjingli.getResult("总经理", request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(3);

        jinli.getResult("经理", request2);
        zongjian.getResult("总监", request2);
        zhongjingli.getResult("总经理", request2);

    }

    @Test
    public void chainresponsibility() {

        CommonManager jinli = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("宗剑");
        GeneralManager zhongjingli = new GeneralManager("钟精励");
        //设置上级，可以根据实际需求来更改设置
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        /*
        客户端的申请都是由'经理'发起，但实际谁来决策由具体管理类来处理，客户端不知道
         */
        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jinli.requestApplications(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜加薪");
        request3.setNumber(500);
        jinli.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请假");
        request4.setNumber(1000);
        jinli.requestApplications(request4);

    }

}