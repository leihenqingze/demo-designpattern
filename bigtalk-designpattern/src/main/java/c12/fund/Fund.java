package c12.fund;

//基金
public class Fund {

    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt1 nd1;
    private Realty rt1;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nd1 = new NationalDebt1();
        rt1 = new Realty();
    }

    public void buyFund(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
        nd1.buy();
        rt1.buy();
    }

    public void sellFund(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
        nd1.sell();
        rt1.sell();
    }

}