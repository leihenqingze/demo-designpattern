package c15.demo2;

public class SqlserverFactory implements Factory {

    public UserDao createUser() {
        return new SqlserverUser();
    }

}