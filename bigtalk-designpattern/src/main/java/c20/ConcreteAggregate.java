package c20;

public class ConcreteAggregate<T> implements Aggregate<T> {

    private Object[] items = new Object[10];

    private int size;

    public void add(T item) {
        items[size] = item;
        size++;
    }

    @Override
    public Iterator<T> createIterator() {
        return new Iterator<T>() {

            int index = 0;

            @Override
            public T first() {
                return (T) items[0];
            }

            @Override
            public T next() {
                return (T) items[index++];
            }

            @Override
            public boolean isDone() {
                return index >= size;
            }

            @Override
            public T currentItem() {
                return (T) items[index];
            }

        };
    }

}