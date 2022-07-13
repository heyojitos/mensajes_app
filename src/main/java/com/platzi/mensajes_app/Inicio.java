package com.platzi.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Alejandra Morataya
 */
public class Inicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MensajesServicios.crearMensaje();
                    break;
                case 2:
                    MensajesServicios.listarMensajes();
                    break;
                case 3:
                    MensajesServicios.borrarMensaje();
                    break;
                case 4:
                    MensajesServicios.editarMensaje();
                    break;
                default:
                    break;
            }

        } while (opcion != 5);

      
    }

}
