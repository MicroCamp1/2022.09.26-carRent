package pl.camp.micro.car.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.camp.micro.car.rent.database.CarRepository;
import pl.camp.micro.car.rent.database.ICarRepository;
import pl.camp.micro.car.rent.gui.GUI;

import java.util.Scanner;

@Component
public class Engine {

    private final Scanner scanner = new Scanner(System.in);
    @Autowired
    ICarRepository carRepository;
    @Autowired
    @Qualifier("abc")
    GUI gui;

    public void start() {
        boolean run = true;
        while (run) {
            this.gui.showMenu();
            switch (scanner.nextLine()) {
                case "1":
                    this.gui.listCars();
                    break;
                case "2":
                    System.out.println("Podaj rejestracje:");
                    System.out.println(this.carRepository
                            .rentCar(this.scanner.nextLine())
                            ? "Done !"
                            : "Not available !");
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        }
    }
}
