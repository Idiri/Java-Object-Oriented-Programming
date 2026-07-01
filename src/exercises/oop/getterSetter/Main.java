package exercises.oop.getterSetter;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Charger", "Yellow", 100000);

        car.setColor("Blue");
        car.setPrice(5000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
