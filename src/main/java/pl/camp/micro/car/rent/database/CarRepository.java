package pl.camp.micro.car.rent.database;

import org.springframework.stereotype.Component;
import pl.camp.micro.car.rent.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarRepository implements ICarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepository() {
        this.cars.add(new Car(1, "BMW", "3", "KR11"));
        this.cars.add(new Car(2, "Audi", "A3", "KR22"));
        this.cars.add(new Car(3, "Toyota", "Corolla", "KR33"));
        this.cars.add(new Car(4, "Mercedess", "A", "KR44"));
        this.cars.add(new Car(5, "Mazda", "5", "KR55"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }

        return false;
    }
}
