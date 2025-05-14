package datastructure.linear.queue;

public interface IQueue<E> {
    public int size();
    public boolean isEmpty();

    public void enqueue(E e);
    public E dequeue();
    public E peek();
}