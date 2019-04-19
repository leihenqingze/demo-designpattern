package c27.music;

import org.junit.Test;

public class Main {

    @Test
    public void run() {
        PlayContext context = new PlayContext();

        System.out.println("上海滩");

        context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String string = context.getText().substring(0, 1);
                switch (string) {
                    case "O":
                        expression = new Scale();// 为O时,实例化音阶
                        break;
                    case "T":
                        expression = new Speed();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression = new Note();// 实例化音符
                        break;
                    default:
                        break;
                }
                expression.interpret(context);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}