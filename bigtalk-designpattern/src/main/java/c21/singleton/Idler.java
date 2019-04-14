package c21.singleton;

/**
 * 懒汉式单例类
 */
public class Idler {

    private static Idler idler;

    private Idler() {
    }

    public static Idler getInstance(){
        if (null == idler){
            idler = new Idler();
        }
        return idler;
    }

}