package c06.clothes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;

    public void show() {
        System.out.println("装扮的" + name);
    }

}