package lab2.task2;

public class task2 {
    public static void main(String[] args) {

        Queue queue1 = new Queue();
        Queue queue2 = new Queue(3);

        System.out.println("Queue 1: is empty - " + queue1.isEmpty() + "; is full - " + queue1.isFull());
        System.out.println("Queue 2 is empty - " + queue2.isEmpty() + "; is full - " + queue2.isFull());

        queue1.push(3);
        queue1.push(7);
        queue1.push(34);

        queue2.push("a");
        queue2.push("x");
        queue2.push("q");

        System.out.println("Queue 2 is empty - " + queue2.isEmpty() + "; is full - " + queue2.isFull());

        queue2.push("z");

        queue1.show();
        System.out.println("Removed: " + queue1.pop());
        queue2.show();
        System.out.println("Removed: " + queue2.pop());

        System.out.println("Queue 1: is empty - " + queue1.isEmpty() + "; is full - " + queue1.isFull());
        System.out.println("Queue 2 is empty - " + queue2.isEmpty() + "; is full - " + queue2.isFull());


        queue1.show();
        queue2.show();
    }
}
