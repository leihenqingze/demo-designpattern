package c15.demo3;

import c15.demo2.AccessUser;
import c15.demo2.UserDao;

public class AccessFactory implements Factory {

    public UserDao createUser() {
        return new AccessUser();
    }

    @Override
    public DepartmentDao createDepartment() {
        return new AccessDepartment();
    }

}