package c15.demo3;

import c15.demo1.User;
import c15.demo2.UserDao;

public class Main {

    //抽象工厂模式
    //只需要改IFactory factory = new AccessFactory()为IFactory factory = new SqlServerFactory()，
    //就可以实现了数据库访问的切换了。
    //解决涉及到多个产品系列的问题，有一个专门的工厂模式叫抽象工厂模式。
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();

        Factory factory = new AccessFactory();

        UserDao iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        DepartmentDao id = factory.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }

}