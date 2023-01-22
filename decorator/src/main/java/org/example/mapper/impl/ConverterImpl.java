package org.example.mapper.impl;

import org.example.domain.UserEntity;
import org.example.domain.dto.UserDto;
import org.example.mapper.Converter;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterImpl implements Converter {
    @Override
    public UserEntity toUserEntity(UserDto dto) {

        String id = dto.getId();
        String name = dto.getName();
        String surname = dto.getSurname();
        int age = dto.getAge();
        String nationality = dto.getNationality();

        return UserEntity.UserEntityBuilder.builder()
                .withId(id)
                .withName(name)
                .withSurname(surname)
                .withAge(age)
                .withNationality(nationality)
                .build();
    }

    @Override
    public UserDto toUserDto(UserEntity entity) {

        String id = entity.getId();
        String name = entity.getName();
        String surname = entity.getSurname();
        int age = entity.getAge();
        String nationality = entity.getNationality();

        UserDto userDto = UserDto.UserDtoBuilder.builder()
                .withName(name)
                .withSurname(surname)
                .withAge(age)
                .withNationality(nationality)
                .build();
        userDto.setId(id);
        return userDto;
    }

    @Override
    public List<UserDto> toListDto(List<UserEntity> entities) {
        return entities.stream().map(this::toUserDto).collect(Collectors.toList());
    }
}
