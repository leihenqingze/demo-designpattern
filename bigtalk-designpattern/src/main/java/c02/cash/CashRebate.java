package c02.cash;

public class CashRebate implements CashSuper {

    private double moneyRebate;

    //打折收费，初始化时，必须要输入折扣率
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}