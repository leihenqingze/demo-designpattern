package c27.interpreter;

//终结符表达式
public class TerminalExpression implements AbstractExpression{

    public void interpret(Context context) {
        System.out.println("终端解释器");
    }

}