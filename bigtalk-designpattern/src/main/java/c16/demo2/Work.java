package c16.demo2;

import lombok.Data;

@Data
public class Work {

    private int hour;
    private boolean workFinished = false;

    //方法如果过长其实极有可能就是有坏味道了
    //这个方法很长，而且有很多个判断分支，这也就意味着它的责任过大了。无论是任何状态，
    //都需要通过它来改变，这实际上是很糟糕的。
    //面向对象设计其实就是希望做到代码的责任分解。违背了‘单一职责原则’
    //由于有这么多判断，使得任何需求的改动或增加都需要去更改这个方法，
    public void writeProgram() {
        if (hour < 12) {
            System.out.println(String.format("当前时间：%s点 上午工作，精神百倍", hour));
        } else if (hour < 13) {
            System.out.println(String.format("当前时间：%s点 饿了，午饭，犯困，午休。", hour));
        } else if (hour < 17) {
            System.out.println(String.format("当前时间：%s点 下午状态不错，继续努力", hour));
        } else {
            if (workFinished) {
                System.out.println(String.format("当前时间：%s点 下班回家了", hour));
            } else {
                if (hour < 21) {
                    System.out.println(String.format("当前时间：%s点 加班哦，疲惫至极", hour));
                } else {
                    System.out.println(String.format("当前时间：%s点 不行了，睡着了", hour));
                }
            }
        }
    }

}