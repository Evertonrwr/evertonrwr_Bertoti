import java.util.*;

public class TrafficLight implements Subject{
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void notify(TrafficLightColor color)  throws InterruptedException  {
        for(var n=0; n<observerList.toArray().length; n++){
            Observer observer = (Observer) observerList.toArray()[n];
                observer.update(color);
            new Thread().sleep(1000);


        };

    }
}
