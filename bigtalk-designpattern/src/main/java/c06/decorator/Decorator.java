package c06.decorator;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public abstract class Decorator implements Component {

    private Component component;

    @Override
    public void operation() {
        if (Objects.nonNull(component))
            component.operation();
    }

}