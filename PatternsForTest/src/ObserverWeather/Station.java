package ObserverWeather;

public class Station extends WeatherSubject{



      private int _temp = 20;
      private int _humidity = 50;

      public void setState(int temp, int humidity){
      this._temp = temp;
      this._humidity = humidity;

      notifyObserver(temp, humidity);

    }
}
