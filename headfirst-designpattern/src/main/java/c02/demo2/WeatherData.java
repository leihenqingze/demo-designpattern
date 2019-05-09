package c02.demo2;

import lombok.Getter;

import java.util.Observable;

public class WeatherData extends Observable {

    @Getter
    private float temperature;
    @Getter
    private float humidity;
    @Getter
    private float pressure;

    /**
     * 1. 先调用setChanged()，标记状态已经改变的事实
     * 2. 然后调用两种notifyObservers()或notifyObservers(Object arg)
     * 第二个方法可以传送任何的数据对象给每一个观察者
     */
    public void measurementsChanged() {
        /*
        这样做尤其必要性。它可以让你更新观察者时，有更多的弹性，你可以适当地通知观察者。
        你也许不会经常用到此功能，但是把这样的功能准备好，当需要时马上就可以使用。总之，
        你需要调用setChanged()，以便通知开始运转。如果此功能在某些地方对你有帮助，你可
        能也需要clearChanged()，将changed状态设置回false。另外也有一个hasChanged()，告诉
        你changed标志的当前方法。
         */
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}