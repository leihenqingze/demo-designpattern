package c13.builder;

import java.util.ArrayList;
import java.util.List;

//Product类—产品类，由多个部件组成
public class Product {

    private List<String> parts = new ArrayList<>();

    //添加产品部件
    public void add(String part) {
        parts.add(part);
    }

    //列举所有的产品部件
    public void show() {
        System.out.println("\n产品 创建 ----");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}