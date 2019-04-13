package c23.command;

import lombok.Setter;

public class Invoker {

    @Setter
    private Command command;

    public void executeCommand() {
        command.execute();
    }

}
