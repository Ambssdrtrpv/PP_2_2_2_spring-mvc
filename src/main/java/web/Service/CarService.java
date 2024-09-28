package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    List<Car> cars = new ArrayList<>();
    {
        for (int i=0; i<5; i++){
            cars.add(Car.createCar(i, "Car make" + (i + 1), "Car model" + (i + 1)));
        }
    }
    public List<Car> getCars(Integer count) {
        if (count == 0 ) return new ArrayList<>();
        if (count > 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
