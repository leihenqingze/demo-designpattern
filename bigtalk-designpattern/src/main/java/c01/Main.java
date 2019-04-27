package c01;

import java.util.Scanner;

/**
 * 运算逻辑和客户端显示逻辑分别在不同类中，彼此修改互不影响，体现了职责分离。
 * 对于不同的客户端，运算逻辑可以复用。
 */
public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字A：");
            double numberA = scanner.nextDouble();
            System.out.println("请输入运算符号(+、-、*、/)：");
            String operate = scanner.next();
            System.out.println("请输入数字B：");
            double numberB = scanner.nextDouble();
            Operation operation = OperationFactory.createOperation(operate);
            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            double result = operation.getResult();
            System.out.println("结果是：" + result);
        } catch (Exception ex) {
            System.out.println("您的输入有错：" + ex.getMessage());
        }
    }

}