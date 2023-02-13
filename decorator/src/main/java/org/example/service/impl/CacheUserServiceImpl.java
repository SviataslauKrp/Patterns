package org.example.service.impl;

import org.example.domain.dto.UserDto;
import org.example.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class CacheUserServiceImpl implements UserService {

    private final UserService dataBase;
    private final List<UserDto> userList = new ArrayList<>();

    public CacheUserServiceImpl(UserService dataBase) {
        this.dataBase = dataBase;
    }

    public void save(UserDto userDto) {
        dataBase.save(userDto);
        userList.add(userDto);
    }

    public void delete(String id) {
        UserDto userById = getByID(id);

        dataBase.delete(id);
        userList.remove(userById);
    }

    public UserDto getByID(String id) {

        for (UserDto userById : userList) {
            if (userById.getId().equals(id)) {
                return userById;
            }
        }
        UserDto userDto = dataBase.getByID(id);
        userList.add(userDto);
        return userDto;
    }

    public void update(String id, UserDto updatedUser) {

        UserDto userById = getByID(id);
        if (userById == null) {
            userById = dataBase.getByID(id);
        }
        dataBase.update(id, updatedUser);

        userList.remove(userById);
        userList.add(updatedUser);

    }

    public void deleteAll() {

        dataBase.deleteAll();
        List<UserDto> copyList = new ArrayList<>(userList);
        userList.removeAll(copyList);
        System.out.println("all users have been deleted");

    }

    @Override
    public List<UserDto> getAll() {
        return dataBase.getAll();
    }
}
