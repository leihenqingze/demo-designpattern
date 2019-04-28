package c06.clothes;

public class Main {

    public static void main(String[] args) {

        Person xc = new Person("小菜");

        System.out.println("\n第一种装扮：");
        TShirts tShirts = new TShirts();
        tShirts.setComponent(xc);
        tShirts.show();

        System.out.println("\n第二种装扮：");
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.setComponent(xc);
        bigTrouser.show();

    }

}
