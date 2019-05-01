package c15.demo4;

import c15.demo2.AccessUser;
import c15.demo2.SqlserverUser;
import c15.demo2.UserDao;
import c15.demo3.AccessDepartment;
import c15.demo3.DepartmentDao;
import c15.demo3.SqlserverDepartment;

//其用那么多的工厂类，不如直接用一个简单工厂来实现
//由于事先设置了db的值（Sqlserver或Access），所以简单工厂的方法都不需要输入参数，
//这样在客户端就只需要DataAccess.createUser()和DataAccess.createDepartment()
//来生成具体的数据库访问类实例，客户端没有出现任何一个SQL Server或Access的字样，达到了解耦合的目的。
//但是如果需要增加Oracle数据库的访问，本来抽象工厂只增加一个OracleFactory工厂类就可以了，现在就比较麻烦了
//这样就需要在DataAccess类中每个方法的switch中加case了
public class DataAccess {

    private static final String db = "Sqlserver";

    public static UserDao createUser() {
        UserDao result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
        }
        return result;
    }

    public static DepartmentDao createDepartment() {
        DepartmentDao result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }

}