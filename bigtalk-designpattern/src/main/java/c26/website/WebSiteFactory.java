package c26.website;

import com.google.common.collect.Maps;

import java.util.Map;

//网站工厂类
public class WebSiteFactory {

    private Map<String, WebSite> flyweight = Maps.newHashMap();

    //获得网站分类
    public WebSite getWebSiteCategory(String key) {
        if (!flyweight.containsKey(key)) {
            flyweight.put(key, new ConcreteWebSite(key));
        }
        return flyweight.get(key);
    }

    //获得网站分类总量
    public int getWebSiteCount() {
        return flyweight.size();
    }

}