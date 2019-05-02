package c19.company;

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
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
        System.out.println(String.format("%s 公司财务收支管理", name));
    }

}