package observer.headfirst;

public class ForeCastConditionDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private Subject weatherData;

  ForeCastConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Forecast conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }
}