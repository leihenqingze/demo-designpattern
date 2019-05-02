package c01.demo3;

public class Operation {

    //实现了业务和界面的分离，这样业务就可以重用了，这里对计算逻辑进行了封装
    public static double getResult(double numbera,double numberb,String operate){
        double result = 0;
        if ("+".equals(operate))
            result = numbera + numberb;
        else if ("-".equals(operate))
            result = numbera - numberb;
        else if ("*".equals(operate))
            result = numbera * numberb;
        else if ("/".equals(operate)) {
            result = numbera / numberb;
        }
        return result;
    }

}