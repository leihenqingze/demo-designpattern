package c28.person;

public class Woman implements Person {

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }

}
