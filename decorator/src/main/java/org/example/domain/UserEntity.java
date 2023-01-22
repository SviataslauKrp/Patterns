package org.example.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserEntity {

    private String name;
    private String surname;
    private int age;
    private String id;
    private String nationality;


    public static final class UserEntityBuilder {
        private String name;
        private String surname;
        private int age;
        private String id;
        private String nationality;

        private UserEntityBuilder() {
        }

        public static UserEntityBuilder builder() {
            return new UserEntityBuilder();
        }

        public UserEntityBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserEntityBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserEntityBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public UserEntityBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public UserEntityBuilder withNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public UserEntity build() {
            UserEntity userEntity = new UserEntity();
            userEntity.setName(name);
            userEntity.setSurname(surname);
            userEntity.setAge(age);
            userEntity.setId(id);
            userEntity.setNationality(nationality);
            return userEntity;
        }
    }
}
