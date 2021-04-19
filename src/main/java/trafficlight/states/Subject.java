package trafficlight.states;

import trafficlight.gui.Observer;
import trafficlight.gui.TrafficLight;

import java.util.ArrayList;
import java.util.List;

public class Subject {
     ArrayList<Observer> trafficLight = new ArrayList<>() ;
   public void  addObserver(Observer trafficLight){
       this.trafficLight.add(trafficLight);
   };
    public void deleteObserver(Observer trafficLight){
        this.trafficLight.remove(trafficLight);
    };
    public void updateObserver(State state){
        for (Observer tf:trafficLight) {
            tf.update(state);
        }
    };
}
