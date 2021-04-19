package trafficlight.gui;

import trafficlight.states.State;
import trafficlight.states.Subject;

public interface Observer {
    void update(State s);
}
