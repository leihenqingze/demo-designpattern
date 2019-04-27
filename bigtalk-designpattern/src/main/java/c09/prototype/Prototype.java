package c09.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Prototype implements Cloneable {

    @Getter
    private String id;

    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}