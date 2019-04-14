package c22.handset.bridge;

import org.junit.Test;

public class Main {

    @Test
    public void run(){
        HandsetBrand ab;
        ab = new HandsetBrandN();
        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();
        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

    }

}
