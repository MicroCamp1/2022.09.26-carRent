package pl.camp.micro.car.rent.database;

import org.springframework.stereotype.Component;
import pl.camp.micro.car.rent.model.Car;

import java.util.List;

@Component
public class CarRepository2 implements ICarRepository {
    @Override
    public List<Car> getCars() {
        return null;
    }

    @Override
    public boolean rentCar(String plate) {
        return false;
    }
}
