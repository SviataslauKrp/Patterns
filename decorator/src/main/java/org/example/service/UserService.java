package org.example.service;

import org.example.domain.dto.UserDto;

import java.util.List;

public interface UserService {

    void save(UserDto userDto);

    void delete(String id);

    UserDto getByID(String id);

    void update(String id, UserDto userDto);

    void deleteAll();

    List<UserDto> getAll();


}
