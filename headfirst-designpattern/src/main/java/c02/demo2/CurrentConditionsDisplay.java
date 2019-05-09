package c02.demo2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    //保存主题对象，方便后面取消注册
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions：" + temperature + "F degrees and " + humidity + "% humidity");
    }

    /**
     * @param o   主题，让观察者知道是哪个主题
     * @param arg 这是传入notifyObservers(Object arg)的数据对象，如果没有说明则为空
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

}