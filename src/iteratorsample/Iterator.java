package iteratorsample;

public interface Iterator<E> {
    public boolean hasNext();
    public E next() throws Exception;
    public void remove();
}
