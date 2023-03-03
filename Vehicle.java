import java.util.Scanner;

class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    public int speed;

    public void run() {


        System.out.println("Speed of bike is: " + speed);
    }
}

class Car extends Vehicle {
    public int speed;

    public void run() {


        System.out.println("Speed of car is: " + speed);
    }
}

