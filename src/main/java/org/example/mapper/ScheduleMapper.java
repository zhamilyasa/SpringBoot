package org.example.mapper;

import org.example.dto.ScheduleDto;
import org.example.model.entity.Schedule;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ScheduleMapper extends EntityMapper<ScheduleDto , Schedule>{
}
