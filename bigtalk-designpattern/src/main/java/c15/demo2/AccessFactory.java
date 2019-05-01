package c15.demo2;

public class AccessFactory implements Factory {

    public UserDao createUser() {
        return new AccessUser();
    }

}