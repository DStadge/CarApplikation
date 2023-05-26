package de.iav.service;

import de.iav.model.Car;
import de.iav.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    public List<Car> getAllCars(){
        return carRepository.getCars();

    }

    public Car getCarByManufactor (String manufactor){
        return carRepository.getCarByManufactor(manufactor);
    }
    public void addCar (Car car){
        carRepository.addCar(car);
    }

}
