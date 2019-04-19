package c27.interpreter;

//非终结符表达式
public class NonterminalTerminalExpression implements AbstractExpression{

    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }

}