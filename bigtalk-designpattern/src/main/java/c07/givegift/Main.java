package c07.givegift;

import org.junit.Test;

public class Main {

    @Test
    public void run() {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy deili = new Proxy(jiaojiao);

        deili.giveDolls();
        deili.giveFlowers();
        deili.giveChocolate();
    }

}
