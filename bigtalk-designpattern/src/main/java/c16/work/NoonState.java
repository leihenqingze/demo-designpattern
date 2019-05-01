package c16.work;

//中午工作状态类
public class NoonState implements State {

    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前时间：%s点 饿了，午饭，犯困，午休。", work.getHour()));
        } else {
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }

}