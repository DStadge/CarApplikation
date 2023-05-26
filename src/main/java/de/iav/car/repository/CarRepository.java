package de.iav.car.repository;

import de.iav.car.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class CarRepository {

    private List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCarByManufactor(String manfactor) {
        for (Car car : cars) {
            if (car.getManufactor().equals(manfactor)) {
                return car;
            }
        }
        throw new NoSuchElementException("Car not found!!!");
    }

    public void addCar(Car carToAdd) {
        cars.add(carToAdd);
    }

}
