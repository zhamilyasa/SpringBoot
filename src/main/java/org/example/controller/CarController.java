package org.example.controller;


import org.example.aspect.ToLogOurApp;
import org.example.dto.CarDto;
import org.example.mapper.CarMapper;
import org.example.model.entity.Car;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {
    private final CarService carService;
    private final CarMapper carMapper;

    @Autowired
    public CarController(CarService carService, CarMapper carMapper) {
        this.carService = carService;
        this.carMapper = carMapper;
    }

    @PostMapping
    public CarDto createCar(@RequestBody CarDto carDto) {
        Car car = carMapper.toEntity(carDto);
        var createCar = carService.createCar(car);
        return carMapper.toDto(createCar);
    }

    @PutMapping("/{id}")
    public CarDto updateCar(@RequestBody CarDto carDto) {
        Car car = carMapper.toEntity(carDto);
        Car updatedCar = carService.update(car);
        return carMapper.toDto(updatedCar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        carService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public CarDto getCarById(@PathVariable Long id) {
        Car car = carService.getById(id);
        return carMapper.toDto(car);
    }
    @ToLogOurApp
    @GetMapping("/byBrand")
    public List<CarDto> getCarsByBrand(@RequestParam(required = false) String brand) {
        Car car = new Car();
        car.setBrand(brand);
        List<Car> cars = carService.getByBrandList(car);
        return carMapper.toDto(cars);
    }
}
