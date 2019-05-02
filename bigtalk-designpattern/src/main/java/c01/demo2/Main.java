package c01.demo2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字A：");
            String strNumbera = scanner.nextLine();
            System.out.println("请输入运算符号(+、-、*、/)：");
            String strOperate = scanner.nextLine();
            System.out.println("请输入数字B：");
            String strNumberb = scanner.nextLine();
            String strResult = "";
            if ("+".equals(strOperate))
                strResult = String.valueOf(Double.valueOf(strNumbera) + Double.valueOf(strNumberb));
            else if ("-".equals(strOperate))
                strResult = String.valueOf(Double.valueOf(strNumbera) - Double.valueOf(strNumberb));
            else if ("*".equals(strOperate))
                strResult = String.valueOf(Double.valueOf(strNumbera) * Double.valueOf(strNumberb));
            else if ("/".equals(strOperate)) {
                if ("0".equals(strNumberb))
                    strResult = "除数不能为0";
                else {
                    strResult = String.valueOf(Double.valueOf(strNumbera) / Double.valueOf(strNumberb));
                }
            }
            System.out.println("结果是：" + strResult);
        } catch (Exception ex) {
            System.out.println("您的输入有错：" + ex.getMessage());
        }
    }

}