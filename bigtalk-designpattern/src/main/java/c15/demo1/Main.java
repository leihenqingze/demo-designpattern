package c15.demo1;

//“这里之所以不能换数据库，原因就在于SqlServerUser su = new SqlServerUser()使得su这个对象被框死在SQL Server上了。
// 如果这里是灵活的，专业点的说法，是多态的，那么在执行su.insert(user)和su.getUser(1)时就不用考虑是在用SQL Server
// 还是在用Access。”
// 用工厂方法模式来封装new SqlServerUser()所造成的变化
// 工厂方法模式是定义一个用户创建对象的接口，让子类决定实例化哪个类
public class Main {

    public static void main(String[] args) {
        User user = new User();
        //与SQL Server耦合
        SqlserverUser su = new SqlserverUser();
        su.insert(user);
        su.getUser(1);
    }

}