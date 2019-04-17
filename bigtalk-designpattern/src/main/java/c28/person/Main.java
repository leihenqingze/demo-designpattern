package c28.person;

import org.junit.Test;

public class Main {

    @Test
    public void run(){
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        //失败时的反应
        Success v1 = new Success();
        o.display(v1);

        //失败时的反应
        Failing v2 = new Failing();
        o.display(v2);

        //恋爱时的反应
        Amativeness v3 = new Amativeness();
        o.display(v3);

        //结婚时的反应
        Marriage v4 = new Marriage();
        o.display(v4);

    }

}
