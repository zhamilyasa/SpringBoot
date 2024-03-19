package org.example.service.impl;

import org.example.error.ResourceNotFoundException;
import org.example.model.entity.Car;
import org.example.model.repository.CarRepository;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car update(Car car) {
        if (!carRepository.existsById(car.getId())) {
            throw new ResourceNotFoundException("Invalid request!");
        }
        carRepository.save(car);
        return car;
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Car getById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Car not found."));
    }

    public List<Car> getByBrandList(Car car) {
        var brand = car.getBrand();
        Specification<Car> specification = Specification.where(null);
        if (brand != null && !brand.isEmpty()) {
            specification = specification.and((root, query, builder) ->
                    builder.like(root.get("author"), "%" + brand + "%"));
        }
        Pageable pageable = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "views"));
        List<Car> resultList = carRepository.findAll(specification, pageable);
        return resultList;
    }

}
