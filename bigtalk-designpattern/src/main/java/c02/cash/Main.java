package c02.cash;

import org.junit.Test;

public class Main {

    @Test
    public void run() {
        String type = "正常收费";
        CashContext csuper = new CashContext(type);
        double totalPrices = csuper.getResult(100);
        System.out.println(totalPrices);
    }

}