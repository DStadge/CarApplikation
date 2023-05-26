package de.iav.controller;

import de.iav.model.Car;
import de.iav.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")

public class Controller {
    private final CarService carService;

    public Controller(CarService carService) {
        this.carService = carService;
    }
    @GetMapping
    public List<Car> getAllCar (){
        return carService.getAllCars();
    }
    @PostMapping
    public void addCar (@RequestBody Car carToAdd){
        carService.addCar(carToAdd);
    }

    @GetMapping("/{manufactor}")
    public Car getCarByManufactor (@PathVariable String manufactor){
        return carService.getCarByManufactor(manufactor);
    }


}
