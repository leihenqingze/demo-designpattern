package c16.work;

//晚上工作状态
public class EveningState implements State {

    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setCurrent(new RestState());
        } else {
            if (work.getHour() < 21) {
                System.out.println(String.format("当前时间：%s点 加班哦，疲惫至极", work.getHour()));
            } else {
                work.setCurrent(new SleepingState());
                work.writeProgram();
            }
        }
    }

}