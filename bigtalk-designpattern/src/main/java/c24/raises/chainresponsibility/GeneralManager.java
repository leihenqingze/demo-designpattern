package c24.raises.chainresponsibility;

import c24.raises.Request;
import c24.raises.chainresponsibility.Manager;

//总经理
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(String.format("%s:%s 数量 %s 被批准",
                    name, request.getRequestContent(), request.getNumber()));
        } else if (request.getRequestType() == "加薪" && request.getNumber() <= 500){
            System.out.println(String.format("%s:%s 数量 %s 被批准",
                    name, request.getRequestContent(), request.getNumber()));
        } else if (request.getRequestType() == "加薪" && request.getNumber() > 500){
            System.out.println(String.format("%s:%s 数量 %s 再说吧",
                    name, request.getRequestContent(), request.getNumber()));
        }
    }

}
