package c21.singleton;

/**
 * 饿汉式单例类
 *
 * 阻止继承，而继承可能会增加实例
 */
public final class Hunger {

    private static Hunger hunger = new Hunger();

    public static Hunger getInstance() {
        return hunger;
    }

}
