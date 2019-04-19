package c27.interpreter;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class Main {


    @Test
    public void run() {
        Context context = new Context();
        List<AbstractExpression> list = Lists.newArrayList();
        list.add(new TerminalExpression());
        list.add(new NonterminalTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression exp : list) {
            exp.interpret(context);
        }

    }

}
