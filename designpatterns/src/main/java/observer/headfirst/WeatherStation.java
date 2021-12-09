package observer.headfirst;

public class WeatherStation {

  public static void main(String[] args) {


    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

    ForeCastConditionDisplay foreCastConditionDisplay = new ForeCastConditionDisplay(weatherData);


    weatherData.setMeasurements(80, 65, 40.4f);

  }

}
