package c17;

public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}