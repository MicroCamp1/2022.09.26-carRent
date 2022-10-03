package pl.camp.micro.car.rent.model;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String plate;
    private boolean rent;

    public Car(int id, String brand, String model,
               String plate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.rent = false;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(this.brand)
                .append(" ")
                .append(this.model)
                .append(" ")
                .append(this.plate)
                .append(" Dostepny: ")
                .append(this.rent ? "Nie" : "Tak").toString();
    }
}
