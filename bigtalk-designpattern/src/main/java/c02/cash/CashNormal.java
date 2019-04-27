package c02.cash;

public class CashNormal implements CashSuper {

    //正常收费，返回原价
    @Override
    public double acceptCash(double money) {
        return money;
    }

}