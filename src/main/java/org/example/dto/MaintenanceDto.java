package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MaintenanceDto {
    private int id;
    private String serviceName;
    private String description;
    private double price;
    private List<Long> carIds;
    private List<Long> scheduleIds;
    private List<Long> userIds;
}