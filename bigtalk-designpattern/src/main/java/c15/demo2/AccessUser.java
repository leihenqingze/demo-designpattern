package c15.demo2;

import c15.demo1.User;

public class AccessUser implements UserDao {

    public void insert(User user) {
        System.out.println("在 Access 中给 User 表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在 Access 中根据 ID 得到 User 表一条记录");
        User user = new User();
        user.setId(id);
        return user;
    }

}