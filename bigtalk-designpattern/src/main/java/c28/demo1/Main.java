package c28.demo1;

import com.google.common.collect.Lists;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Lists.newArrayList();
        Person man1 = new Man();
        man1.setAction("成功");
        people.add(man1);
        Person woman1 = new Woman();
        woman1.setAction("成功");
        people.add(woman1);

        for (Person person : people) {
            person.getConclusion();
        }
    }

}