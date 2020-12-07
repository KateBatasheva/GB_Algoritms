package lesson4;

public class MyStack <T> {
    private MyLinkedList<T> stack= new MyLinkedList<>();
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void add(T item){
        stack.insertLast(item);
    }

    public T remove(){
        return stack.removeLast();
    }
    public T peekFront(){
        return stack.getLast();
    }
}
