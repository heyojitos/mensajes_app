
package com.platzi.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author Alejandra Morataya
 */
public class Inicio {
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();

        try (Connection conn = conexion.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
