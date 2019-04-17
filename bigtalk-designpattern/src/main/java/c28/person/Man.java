package c28.person;

public class Man implements Person{

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

}
