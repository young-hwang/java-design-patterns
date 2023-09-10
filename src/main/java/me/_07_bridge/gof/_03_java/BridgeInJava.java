package me._07_bridge.gof._03_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BridgeInJava {
    // Logger facade
    private static Logger logger = LoggerFactory.getLogger(BridgeInJava.class);

    public static void main(String[] args) throws ClassNotFoundException {
        logger.info("hello logger");

        Class.forName("org.h2.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/spring-framework-basic", "sa", "")) {
            String sql = "CREATE TABLE ACCOUNT " +
                    "(id integer not null, " +
                    "email varchar(255), " +
                    "password varchar(255), " +
                    " primary key (id))";
            Statement statement = conn.createStatement();
            statement.execute(sql);

//            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
