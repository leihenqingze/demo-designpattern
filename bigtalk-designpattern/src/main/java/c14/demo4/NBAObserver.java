package c14.demo4;

//看NBA的同事
public class NBAObserver {

    private String name;
    private Subject subject;

    public NBAObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    //关闭NBA直播
    public void closeNBADirectSeeding() {
        System.out.println(String.format("%s %s 关闭NBA直播，继续工作! ", subject.getSubjectState(), name));
    }

}
