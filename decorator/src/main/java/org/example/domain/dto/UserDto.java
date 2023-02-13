package org.example.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Setter
@Getter
@ToString
public class UserDto {

    private String name;
    private String surname;
    private int age;
    private String id = UUID.randomUUID().toString();
    private String nationality;

    public static final class UserDtoBuilder {
        private String name;
        private String surname;
        private int age;
        private String nationality;

        private UserDtoBuilder() {
        }

        public static UserDtoBuilder builder() {
            return new UserDtoBuilder();
        }

        public UserDtoBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserDtoBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserDtoBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public UserDtoBuilder withNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public UserDto build() {
            UserDto userDto = new UserDto();
            userDto.setName(name);
            userDto.setSurname(surname);
            userDto.setAge(age);
            userDto.setNationality(nationality);
            return userDto;
        }
    }
}
