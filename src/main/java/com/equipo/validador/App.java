package com.equipo.validador;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());
        String usuario = "admin";
        String password = "123456"; // Hardcoded credentials
        if (usuario.equals("admin") && password.equals("123456")) {
            logger.log(INFO,"¡Bienvenido administrador!");
        }
    }
}
