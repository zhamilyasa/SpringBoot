package org.example.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDto {
    private int id;
    private Long userId;
    private Long carId;
    private Long maintenanceId;
    private LocalDateTime dateTime;
    private String additionalNotes;
}