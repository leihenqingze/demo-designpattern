package c22.handset.trademark;

import org.junit.Test;

public class Main {

    @Test
    public void run(){
        HandsetBrand ab;
        ab = new HandsetBrandMAddressList();
        ab.run();

        ab = new HandsetBrandMGame();
        ab.run();

        ab = new HandsetBrandNAddressList();
        ab.run();

        ab = new HandsetBrandNGame();
        ab.run();

    }

}
