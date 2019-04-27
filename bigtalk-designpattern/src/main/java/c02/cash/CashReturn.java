package c02.cash;

public class CashReturn implements CashSuper {

    private double moneyCondition;

    private double moneyReturn;

    //打折收费，初始化时，必须要输入折扣率
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }

}