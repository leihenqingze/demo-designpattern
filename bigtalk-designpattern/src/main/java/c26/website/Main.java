package c26.website;

import org.junit.Test;

public class Main {

    @Test
    public void run() {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = factory.getWebSiteCategory("产品展示");
        fx.use(new User("大鸟"));

        WebSite fz = factory.getWebSiteCategory("产品展示");
        fx.use(new User("娇娇"));

        WebSite fl = factory.getWebSiteCategory("博客");
        fx.use(new User("老顽童"));

        WebSite fm = factory.getWebSiteCategory("博客");
        fx.use(new User("桃谷六仙"));

        WebSite fn = factory.getWebSiteCategory("博客");
        fx.use(new User("南海鳄神"));

        System.out.println(String.format("得到网站分类总数量为 %s",
                factory.getWebSiteCount()));

    }

}
