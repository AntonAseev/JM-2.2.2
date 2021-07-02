package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getNeedCountCars(Integer count) {
        List<Car> needCountCars = new ArrayList<>();
        if (count == null || count > 5) {
            needCountCars = Car.getCars();
        } else {
            for (int i = 0; i < count; i++) {
                needCountCars.add(Car.getCars().get(i));
            }
        }
        return needCountCars;
    }

}
