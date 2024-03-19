package org.example.mapper;

import org.example.dto.CarDto;
import org.example.model.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface CarMapper extends EntityMapper<CarDto , Car> {
    Car toEntity(CarDto dto);

    CarDto toDto(Car entity);

    List<Car> toEntity(List<CarDto> dtoList);

    List<CarDto> toDto(List<Car> entityList);
}
