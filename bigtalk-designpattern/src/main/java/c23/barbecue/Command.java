package c23.barbecue;

import lombok.AllArgsConstructor;

/**
 * 抽象命令类，只需要确定'烤肉串者'是谁
 */
@AllArgsConstructor
public abstract class Command {

    protected Barbecue receiver;

    public abstract void excuteCommand();

}
