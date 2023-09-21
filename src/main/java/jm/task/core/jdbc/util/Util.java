package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Util {

    public static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String DB_URL = "jdbc:mysql://localhost:3306/database_name";
    public static String DB_USERNAME = "root";
    public static String DB_PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection OK!");
        } catch (ClassNotFoundException | SQLException e ) {
            e.printStackTrace();
            System.out.println("Connection not OK(((9(");
        }
        return connection;
    }

}
