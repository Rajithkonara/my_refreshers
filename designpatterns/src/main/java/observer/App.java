package observer;

import observer.generic.GHobbits;
import observer.generic.GOrcs;
import observer.generic.GWeather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();


//        // Generic observer inspired by Java Generics and Collection by Naftalin & Wadler
//        LOGGER.info("--Running generic version--");
//        GWeather gWeather = new GWeather();
//        gWeather.addObserver(new GOrcs());
//        gWeather.addObserver(new GHobbits());
//
//        gWeather.timePasses();
//        gWeather.timePasses();
//        gWeather.timePasses();
//        gWeather.timePasses();

    }
}
