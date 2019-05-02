package c01.demo3;

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
            String strResult = String.valueOf(Operation.getResult(Double.valueOf(strNumbera),
                    Double.valueOf(strNumberb),strOperate));
            System.out.println("结果是：" + strResult);
        } catch (Exception ex) {
            System.out.println("您的输入有错：" + ex.getMessage());
        }
    }

}