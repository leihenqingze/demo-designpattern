package c23.barbecue;

/**
 * 具体命令类，执行命令时，执行具体的行为
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecue receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }

}
