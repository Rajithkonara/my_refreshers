package adapter.weather;

public class WeatherUI {

    public void showTemperature(int zipCode) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        weatherAdapter.findTemp(zipCode);
    }

}
