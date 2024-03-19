package org.example.service;

import org.example.model.entity.Car;

import java.util.List;

public interface CarService {
    Car createCar(Car car);
    Car update(Car car);
    void delete(Long id);
    Car getById(Long id);
    List<Car> getByBrandList (Car car);
}
