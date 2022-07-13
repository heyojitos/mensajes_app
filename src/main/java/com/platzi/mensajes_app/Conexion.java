/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alejandra Morataya
 */
public class Conexion {

    public Connection get_connection() {
        Connection connection = null;

        final String DATABASE = "mensajes_app";
        final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
        final String USER = "root";
        final String PASSWORD = "";

        try {
            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );
            if (connection != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

}
