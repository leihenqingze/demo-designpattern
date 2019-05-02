package c19.company;

public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        System.out.println(new String("-") + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s 员工招聘培训管理", name));
    }

}