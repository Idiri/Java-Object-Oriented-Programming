package exercises.oop.polymorphism;

public class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("You drive the car");
    }
}
