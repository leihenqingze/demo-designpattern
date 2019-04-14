package c24.raises.chainresponsibility;

import c24.raises.Request;
import c24.raises.chainresponsibility.Manager;

//经理
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")
                && request.getNumber() <= 2) {
            System.out.println(String.format("%s:%s 数量 %s 被批准",
                    name, request.getRequestContent(), request.getNumber()));
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }

}
