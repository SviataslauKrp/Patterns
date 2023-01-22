package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    public Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
//            для теста
//            Statement statement = connection.createStatement();
//            statement.execute("drop table if exists users;\n" +
//                    "create table users\n" +
//                    "(\n" +
//                    "    id          varchar     not null\n" +
//                    "        primary key,\n" +
//                    "    name        varchar(20) not null,\n" +
//                    "    surname     varchar(30) not null,\n" +
//                    "    age         integer,\n" +
//                    "    nationality varchar(40)\n" +
//                    ");");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
