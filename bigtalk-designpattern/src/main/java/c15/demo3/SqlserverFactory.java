package c15.demo3;

import c15.demo2.SqlserverUser;
import c15.demo2.UserDao;

public class SqlserverFactory implements Factory {

    public UserDao createUser() {
        return new SqlserverUser();
    }

    @Override
    public DepartmentDao createDepartment() {
        return new SqlserverDepartment();
    }

}