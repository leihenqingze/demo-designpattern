package c23.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Command {

    protected Receiver receiver;

    public abstract void execute();

}
