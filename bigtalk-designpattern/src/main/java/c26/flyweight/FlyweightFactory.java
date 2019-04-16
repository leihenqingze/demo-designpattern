package c26.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> flyweight = Maps.newHashMap();

    public FlyweightFactory() {
        flyweight.put("X", new ConcreteFlyweight());
        flyweight.put("Y", new ConcreteFlyweight());
        flyweight.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweight.get(key);
    }

}