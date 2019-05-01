package c15.demo2;

import c15.demo1.User;

public class Main {

    //工厂模式
    public static void main(String[] args) {
        User user = new User();
        //如果要换数据库，只需要把new SqlServerFactory()改成new AccessFactory()，
        //此时由于多态的关系，使得声明IUser接口的对象iu事先根本不知道是在访问哪个数据库，
        //却可以在运行时很好地完成工作，这就是所谓的业务逻辑与数据访问的解耦。
        //这样写，代码里还是有指明new SqlServerFactory()，要改的地方，依然很多。
        //问题还没有完全解决，数据库里面不可能只有一个User表，很可能有其他表，比如增加部门表（Department表）
        //但要增加好多的类了，多写些类有什么关系，只要能增加灵活性，以后就不用加班了
        Factory factory = new SqlserverFactory();
        UserDao iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);
    }

}