package lab2.task1;

public class task1 {

    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(2.5);
        Box box3 = new Box(2.3, 1.8, 4);

        System.out.println("The area of the 3rd box is: " + box3.getArea());
        System.out.println("The volume of the 3rd box is: " + box3.getVolume());
    }
}
