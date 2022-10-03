package pl.camp.micro.car.rent.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.micro.car.rent.database.CarRepository;
import pl.camp.micro.car.rent.database.CarRepository2;
import pl.camp.micro.car.rent.database.ICarRepository;
import pl.camp.micro.car.rent.model.Car;

@Component("abc")
public class GUI {

    @Autowired
    private ICarRepository carRepository;

    public void showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
    }

    public void listCars() {
        for(Car car : carRepository.getCars()) {
            System.out.println(car);
        }
    }
}
