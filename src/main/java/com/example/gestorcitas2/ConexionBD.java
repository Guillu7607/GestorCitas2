package com.example.gestorcitas2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/clínica";
    private static final String USER = "root";
    private static final String PASSWORD = "toor";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public abstract List<Paciente> obtenerPacientes();
}