package c21.singleton;

/**
 * 保证线程安全的懒汉式单例类
 */
public class LockSingleton {

    private static LockSingleton singleton;

    private LockSingleton() {
    }

    public synchronized static LockSingleton getInstance() {
        if (null == singleton) {
            singleton = new LockSingleton();
        }
        return singleton;
    }

}