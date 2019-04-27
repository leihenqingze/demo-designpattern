package c09.resume;

//简历
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经验
    public void setWorkExperience(String workDate, String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    //显示
    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + work.getWorkDate() + " " + work.getCompany());
    }

    public Resume clone() {
        try {
            Resume resume = (Resume) super.clone();
            WorkExperience work = this.work.clone();
            resume.work = work;
            return resume;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}