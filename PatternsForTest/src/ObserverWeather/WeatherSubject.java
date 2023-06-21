package ObserverWeather;

import java.util.*;
import java.util.ArrayList;

public abstract class WeatherSubject {

    private final List<Observer> observerList= new ArrayList<Observer>();


    public void register (Observer newObserver){
        observerList.add(newObserver);
    }
    public void unregister (Observer newObserver){
        observerList.remove(newObserver);
    }
    protected void notifyObserver(int temp, int humidity){
        for (Observer o : observerList){
            o.update(temp, humidity);
        }
    }
}
