package web.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Car {

    private String color;
    private String model;
    private int number;

    public Car() {
    }

    public Car(String color, String model, int number) {
        this.color = color;
        this.model = model;
        this.number = number;
    }

    public static List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("black", "BMW X6", 666));
        carList.add(new Car("red", "Mazda", 123));
        carList.add(new Car("white", "Mercedes", 777));
        carList.add(new Car("green", "Skoda", 456));
        carList.add(new Car("pink", "Ford", 987));
        return carList;
    }

    @Override
    public String toString() {
        return "Car: " + "color - " + color + ", model - " + model + ", number - " + number;
    }
}
