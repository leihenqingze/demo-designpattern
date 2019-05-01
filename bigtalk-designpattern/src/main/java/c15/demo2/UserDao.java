package c15.demo2;

import c15.demo1.User;

public interface UserDao {

    void insert(User user);

    User getUser(int id);

}