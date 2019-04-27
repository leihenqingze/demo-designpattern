package c02.cash;

//现金收费抽象类
public interface CashSuper {

    //现金收取超类的抽象方法，收取现金，参数为原价，返回为当前价
    double acceptCash(double money);

}