package c09.demo1;

public class Main {

    //如果有一个地方写错了，需要每个地方都要修改
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1999-2000","XX公司");

        Resume b = new Resume("大鸟");
        b.setPersonalInfo("男","29");
        b.setWorkExperience("1998-2000","XX公司");

        Resume c = new Resume("大鸟");
        c.setPersonalInfo("男","29");
        c.setWorkExperience("1998-2000","XX公司");

        a.display();
        b.display();
        c.display();
    }

}