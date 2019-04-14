package c21.singleton;

/**
 * 双重锁定懒汉式单例类
 */
public class DoubleCheckLock {

    private static Object lock = new Object();

    private static DoubleCheckLock singleton;

    private DoubleCheckLock() {
    }

    public synchronized static DoubleCheckLock getInstance() {
        if (null == singleton){
            synchronized (lock){
                if (null == singleton){
                    singleton = new DoubleCheckLock();
                }
            }
        }
        return singleton;
    }

}