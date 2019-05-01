package c16.work;

//睡眠状态
public class SleepingState implements State {

    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点 不行了，睡着了", work.getHour()));
    }

}