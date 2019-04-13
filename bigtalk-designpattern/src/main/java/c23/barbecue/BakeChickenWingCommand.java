package c23.barbecue;

public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecue receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }

}
