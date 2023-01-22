package org.example.mapper;

import org.example.domain.UserEntity;
import org.example.domain.dto.UserDto;

import java.util.List;

public interface Converter {

    UserEntity toUserEntity(UserDto dto);
    UserDto toUserDto(UserEntity entity);

    List<UserDto> toListDto(List<UserEntity> entities);

}
