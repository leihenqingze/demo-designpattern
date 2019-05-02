package c19.company;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

    private List<Company> companies = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(new String("-") + name);
        for (Company company : companies) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : companies) {
            company.lineOfDuty();
        }
    }

}