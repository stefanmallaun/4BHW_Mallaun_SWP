package ObserverWeather;

public class Signal implements Observer{
    @Override
    public void update(int temp, int humidity) {
        System.out.println("temp is: " + temp + "humidity is: " + humidity);
    }
}
