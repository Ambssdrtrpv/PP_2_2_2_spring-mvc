package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int id;
    private String make;
    private String model;

    public Car(){}

    public Car(int id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    public static Car createCar(int id, String make, String model){
        return new Car(id, make, model);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
