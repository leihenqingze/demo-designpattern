package c09.demo1;

//简历
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String workDate;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经验
    public void setWorkExperience(String workDate, String company) {
        this.workDate = workDate;
        this.company = company;
    }

    //显示
    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + workDate + " " + company);
    }

}