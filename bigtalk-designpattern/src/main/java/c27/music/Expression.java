package c27.music;

import org.apache.commons.lang3.StringUtils;

//表达式类
public abstract class Expression {

    //解释器
    public void interpret(PlayContext context) {
        if (StringUtils.isNotEmpty(context.getText())) {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            int index =  context.getText().indexOf(" ");
            double playValue = Double.valueOf(context.getText().substring(0, index));
            context.setText(context.getText().substring(index + 1));
            excute(playKey,playValue);
        }
    }

    //执行
    public abstract void excute(String key, double value);

}