package c14.delegation;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {

    private List<Event> events = new ArrayList<>();

    public void update() {
        for (Event event : events) {
            event.update();
        }
    }

}
