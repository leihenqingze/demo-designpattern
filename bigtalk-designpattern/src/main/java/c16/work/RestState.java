package c16.work;

//下班休息状态
public class RestState implements State {

    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点 加班哦，疲惫至极", work.getHour()));
    }

}