package org.example.mapper;

import org.example.dto.MaintenanceDto;
import org.example.model.entity.Maintenance;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface MaintenanceMapper extends  EntityMapper<MaintenanceDto , Maintenance> {
}
