package c15.demo4;

import c15.demo1.User;
import c15.demo2.UserDao;
import c15.demo3.Department;
import c15.demo3.DepartmentDao;

public class Main {

    //简单工厂
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();

        UserDao iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);

        DepartmentDao id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }

}