package c24.raises;

public class Manager {

    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    /**
     * 职责过多
     * 增加新的管理类别，需要修改这个类
     * 比较长的方法，多条的分支，这些都是代码的坏味道
     */
    public void getResult(String managerLevel, Request request) {
        if (managerLevel == "经理") {
            if (request.getRequestType().equals("请假")
                    && request.getNumber() <= 2) {
                System.out.println(String.format("%s:%s 数量 %s 被批准",
                        name, request.getRequestContent(), request.getNumber()));
            } else {
                System.out.println(String.format("%s:%s 数量 %s 我无权处理",
                        name, request.getRequestContent(), request.getNumber()));
            }
        } else if (managerLevel == "总监") {
            if (request.getRequestType().equals("请假")
                    && request.getNumber() <= 5) {
                System.out.println(String.format("%s:%s 数量 %s 被批准",
                        name, request.getRequestContent(), request.getNumber()));
            } else {
                System.out.println(String.format("%s:%s 数量 %s 我无权处理",
                        name, request.getRequestContent(), request.getNumber()));
            }
        } else if (managerLevel == "总经理") {
            if (request.getRequestType().equals("请假")) {
                System.out.println(String.format("%s:%s 数量 %s 被批准",
                        name, request.getRequestContent(), request.getNumber()));
            } else if (request.getRequestType() == "加薪" && request.getNumber() <= 500) {
                System.out.println(String.format("%s:%s 数量 %s 被批准",
                        name, request.getRequestContent(), request.getNumber()));
            } else if (request.getRequestType() == "加薪" && request.getNumber() > 500) {
                System.out.println(String.format("%s:%s 数量 %s 再说吧",
                        name, request.getRequestContent(), request.getNumber()));
            }
        }
    }

}
