package c16.work;

//下午工作状态
public class AfternoonState implements State {

    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println(String.format("当前时间：%s点 下午状态不错，继续努力", work.getHour()));
        } else {
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }

}