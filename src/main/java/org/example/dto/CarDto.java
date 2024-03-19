package org.example.dto;

import lombok.*;

import java.util.List;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private Integer year;
    private String licensePlate;
    private String vin;
    private Long userId;
    private List<Long> scheduleIds;
    private List<Long> maintenanceIds;
}