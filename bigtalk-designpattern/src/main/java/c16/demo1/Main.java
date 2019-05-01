package c16.demo1;

public class Main {

    //钟点
    private static int hour = 0;
    //任务完成标记
    private static boolean workFinished = false;

    //写程序方法
    public static void writeProgram() {
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

    public static void main(String[] args) {
        hour = 9;
        writeProgram();
        hour = 10;
        writeProgram();
        hour = 12;
        writeProgram();
        hour = 13;
        writeProgram();
        hour = 17;

        workFinished = true;
        writeProgram();
        hour = 19;
        writeProgram();
        hour = 22;
        writeProgram();

    }

}