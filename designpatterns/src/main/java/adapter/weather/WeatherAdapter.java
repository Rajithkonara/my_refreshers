package adapter.weather;

public class WeatherAdapter {

    public int findTemp(int zipCode) {
        String city = null;

        if (zipCode == 10) {
            city = "Moscow";
        }

        WeatherFinder weatherFinder = new WeatherFinderImpl();

        return weatherFinder.find(city);
    }

}
