package lab2.task2;


import java.util.LinkedList;

public class Queue<T> {
    private int state;
    private int maxSize;
    private LinkedList<T> queue;

    Queue () {
        state = 0;
        maxSize = -1; // not relevant because linked lists will never be full unless you fill all memory
        queue = new LinkedList<>();
    }

    Queue (int maxSize) {
        state = 0;
        this.maxSize = maxSize;
        queue = new LinkedList<>();
    }

    public boolean isEmpty(){
        return state == 0;
    }

    public boolean isFull(){
        return state == maxSize;
    }


    public void push (T data) {
        if (state < maxSize || maxSize == -1) {
            queue.add(data);
            state++;
        } else System.out.println("Can't push " + data +  ", queue is full.");
    }


    public T pop () {
        if (!queue.isEmpty()) {
            T removed = queue.get(0);
            queue.remove(0);
            state--;
            return removed;

        } else {
            System.out.println("Can't pop, queue is empty.");
            return null;
        }
    }

    public void show(){
        System.out.print("Elements of the queue: ");
        for (T data: queue) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}
