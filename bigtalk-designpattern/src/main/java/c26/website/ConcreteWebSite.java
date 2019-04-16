package c26.website;

import lombok.AllArgsConstructor;

//具体网站类
@AllArgsConstructor
public class ConcreteWebSite implements WebSite {

    private String name;

    @Override
    public void use(User user) {
        System.out.println(String.
                format("网站分类：" + name + " 用户：" + user.getName()));
    }

}