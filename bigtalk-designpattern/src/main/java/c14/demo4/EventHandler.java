package c14.demo4;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {

    private List<Event> events = new ArrayList<>();

    //增加
    public void attach(Event observer) {
        events.add(observer);
    }

    //减少
    public void detach(Event observer) {
        events.remove(observer);
    }

    public void update() {
        for (Event event : events) {
            event.update();
        }
    }

}
