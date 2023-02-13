package org.example;

import org.example.domain.dto.UserDto;
import org.example.repository.DBUserServiceImpl;
import org.example.service.UserService;
import org.example.service.impl.CacheUserServiceImpl;

public class App {

    public static void main(String[] args) {
        UserDto userDto = UserDto.UserDtoBuilder.builder()
                .withName("Alexey")
                .withSurname("Mishkin")
                .withAge(30)
                .withNationality("belarus")
                .build();

        UserDto userDto1 = UserDto.UserDtoBuilder.builder()
                .withName("Sergey")
                .withSurname("Bubkin")
                .withAge(55)
                .withNationality("chinese")
                .build();

        UserService cache = new CacheUserServiceImpl(new DBUserServiceImpl());

//        cache.deleteAll();
        cache.save(userDto1);
        cache.save(userDto);
//        cache.update("9ccd362f-5bde-48b0-bdea-c5c13610a9b5", userDto1);
//        cache.delete("9ccd362f-5bde-48b0-bdea-c5c13610a9b5");

        cache.deleteAll();

    }
}
