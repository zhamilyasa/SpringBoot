package org.example.service;

import org.example.entity.Car;
import org.example.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceLogic {

    public final CarRepository repository;

    public CarServiceLogic(CarRepository repository) {
        this.repository = repository;
    }

    public String addCar(Car car){
        if (!car.getName().isBlank() && car.getName().length()>3){
            repository.save(car);
        }
        return "Added";
    }

    public List<Car> getAllCar(){
        return repository.findAll();
    }
}
