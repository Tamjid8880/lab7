import java.util.Scanner;

public class TestVehicle {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car speed: ");
        int bikeSpeed = scanner.nextInt();


        System.out.print("Enter bike speed: ");
        int carSpeed = scanner.nextInt();

        Vehicle vehicle1 = new Vehicle();
        Bike bike1 = new Bike();
        bike1.speed=bikeSpeed;
        Car car1 = new Car();
        car1.speed=carSpeed;

        vehicle1.run(); // prints "Vehicle is running"
        bike1.run(); // prompts user to input bike speed and prints "Speed of bike is: (user input)"
        car1.run(); // prompts user to input car speed and prints "Speed of car is: (user input)"
    }
}
