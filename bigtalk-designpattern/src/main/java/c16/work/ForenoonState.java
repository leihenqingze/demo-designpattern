package c16.work;

//上午工作状态类
public class ForenoonState implements State {

    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println(String.format("当前时间：%s点 上午工作，精神百倍", work.getHour()));
        } else {
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }

}