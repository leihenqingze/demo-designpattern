package c06.clothes;

import lombok.Setter;

import java.util.Objects;

public abstract class Finery extends Person {

    @Setter
    protected Person component;

    @Override
    public void show() {
        if (Objects.nonNull(component))
            component.show();
    }

}