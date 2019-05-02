package c01.demo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A：");
        //命名不规范
        String a = scanner.nextLine();
        System.out.println("请输入运算符号(+、-、*、/)：");
        String b = scanner.nextLine();
        System.out.println("请输入数字B：");
        String c = scanner.nextLine();
        String d = "";
        //这里意味着每个分支条件都要判断，等于计算机做了三次无用功
        if ("+".equals(b))
            d = String.valueOf(Double.valueOf(a) + Double.valueOf(c));
        if ("-".equals(b))
            d = String.valueOf(Double.valueOf(a) - Double.valueOf(c));
        if ("*".equals(b))
            d = String.valueOf(Double.valueOf(a) * Double.valueOf(c));
        if ("/".equals(b))
            //如果除数时，客户端输入了0怎么办，如果用户输入的是字符串符号而不是数字怎么办
            //需要处理异常
            d = String.valueOf(Double.valueOf(a) / Double.valueOf(c));
        System.out.println("结果是：" + d);
    }

}