package org.example.repository;

import org.example.config.DBConnector;
import org.example.domain.UserEntity;
import org.example.domain.dto.UserDto;
import org.example.mapper.Converter;
import org.example.mapper.impl.ConverterImpl;
import org.example.service.UserService;
import org.example.service.Validator;
import org.example.service.impl.IDValidatorImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUserServiceImpl implements UserService {

    private final DBConnector connector = new DBConnector();
    private final Converter converter = new ConverterImpl();
    private final Validator idValidator = new IDValidatorImpl();

    public void save(UserDto userDto) {

        UserEntity userEntity = converter.toUserEntity(userDto);

        String name = userEntity.getName();
        String surname = userEntity.getSurname();
        int age = userEntity.getAge();
        String id = userEntity.getId();
        String nationality = userEntity.getNationality();

        try (Connection connection = connector.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("INSERT INTO users (id, name, surname, age, nationality) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setInt(4, age);
            preparedStatement.setString(5, nationality);

            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("the user has been added: " + name + " " + surname);
    }

    public void delete(String id) {
        try (Connection connection = connector.getConnection()) {

            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            statement.setString(1, id);
            statement.execute();

            System.out.println("the user has been deleted");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public UserDto getByID(String id) {
        UserEntity userEntity = new UserEntity();

        try (Connection connection = connector.getConnection()) {

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                userEntity.setId(resultSet.getString("id"));
                userEntity.setName(resultSet.getString("name"));
                userEntity.setSurname(resultSet.getString("surname"));
                userEntity.setAge(resultSet.getInt("age"));
                userEntity.setNationality(resultSet.getString("nationality"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        idValidator.validateID(userEntity);
        return converter.toUserDto(userEntity);
    }

    public void update(String id, UserDto userDto) {
        UserEntity updatedUser = converter.toUserEntity(userDto);

        try(Connection connection = connector.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE users " +
                    "SET name = ?, " +
                    "surname = ?, " +
                    "age = ?, " +
                    "nationality = ? " +
                    "WHERE id = ?");
            statement.setString(1, updatedUser.getName());
            statement.setString(2, updatedUser.getSurname());
            statement.setInt(3, updatedUser.getAge());
            statement.setString(4, updatedUser.getNationality());
            statement.setString(5, id);

            statement.executeUpdate();

            System.out.println("the user has been updated");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAll() {
        try (Connection connection = connector.getConnection()) {

            Statement statement = connection.createStatement();
            statement.executeUpdate("TRUNCATE TABLE users");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("all users have been deleted");
    }

    @Override
    public List<UserDto> getAll() {

        List<UserEntity> entities = new ArrayList<>();

        try (Connection connection = connector.getConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String nationality = resultSet.getString("nationality");

                UserEntity userEntity = UserEntity.UserEntityBuilder.builder()
                        .withId(id)
                        .withName(name)
                        .withSurname(surname)
                        .withAge(age)
                        .withNationality(nationality)
                        .build();
                entities.add(userEntity);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return converter.toListDto(entities);
    }

}
