package c15.demo3;

import c15.demo2.UserDao;

public interface Factory {

    UserDao createUser();

    DepartmentDao createDepartment();

}