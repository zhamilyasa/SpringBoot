package org.example.mapper;

import org.example.dto.UserDto;
import org.example.model.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper extends EntityMapper<UserDto, User >{
    UserDto toDto(User entity);
    User toEntity(UserDto dto);
}
