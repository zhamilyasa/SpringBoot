package org.example.model.repository;

import org.example.model.entity.Car;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAll(Specification<Car> specification, Pageable pageable);
}
