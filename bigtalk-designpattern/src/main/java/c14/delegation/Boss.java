package c14.delegation;

public class Boss implements Subject {

    private EventHandler eventHandler;

    private String action;

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    public void notifyObservers() {
        eventHandler.update();
    }

    @Override
    public String getSubjectState() {
        return action;
    }

    @Override
    public String setSubjectState(String state) {
        return action = state;
    }

}
