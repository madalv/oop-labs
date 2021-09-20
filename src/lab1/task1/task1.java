package lab1.task1;

public class task1 {

    public static void main(String[] args) {

        // first monitor object
        monitor monitor1 = new monitor();
        monitor1.brand = "ASUS";
        monitor1.color = "darkGrey";
        monitor1.setResolution(1920, 1080);
        monitor1.screenSizeInInches = 27;

        // second monitor object
        monitor monitor2 = new monitor();
        monitor2.brand = "Razer";
        monitor2.color = "black";
        monitor2.screenSizeInInches = 27;
        monitor2.setResolution(2560, 1440);

        System.out.println(monitor1.getResolution());

        // compare 2 monitors
        if (monitor1.compare(monitor2))
            System.out.println("Monitors have the same properties.");
        else System.out.println("Monitors don't have the same properties.");

    }
}
