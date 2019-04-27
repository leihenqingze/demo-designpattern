package c02.cash;

public class CashContext {

    private CashSuper cs;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn(300,100);
                break;
            case "打9折":
                cs = new CashRebate(9);
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }

}
