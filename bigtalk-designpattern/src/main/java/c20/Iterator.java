package c20;

public interface Iterator<T> {

    T first();
    T next();
    boolean isDone();
    T currentItem();

}