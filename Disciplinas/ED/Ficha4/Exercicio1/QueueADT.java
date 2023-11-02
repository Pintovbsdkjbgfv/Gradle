package Ficha4.Exercicio1;

public interface QueueADT<T> {
    
    void enqueue(T element);

    T queue();

    T first();

    boolean isEmpty();

    int size();

    String toString();
}
