package lesson3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyDeQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }


    public T removeBegin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        size--;
        begin = nextIndex(begin);
        T temp = list[begin];
        list[begin] = null;
        return temp;
    }
    public T removeEnd() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        size--;
        end = previousIndex(end);
        T temp = list[end];
        list[end] = null;
        return  temp;
    }

    public void insertEnd(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        if (list[end] != null){
            end = nextIndex(end);
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }
    public void insertBegin(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        if (list[begin] != null){
            begin = previousIndex(begin);
        }
        size++;
        list[begin] = item;
        begin = previousIndex(begin);
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }
    private int previousIndex(int index) {
        if (index == 0){
            return list.length-1;
        }
        return (index - 1) % list.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " begin: " + begin + " end: " + end;
    }
}
