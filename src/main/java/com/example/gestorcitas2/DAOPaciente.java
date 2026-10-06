package com.example.gestorcitas2;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DAOPaciente extends ConexionBD {
    public List<Paciente> obtenerPacientes() {
        List<Paciente> lista = new ArrayList<>();
        // Calificas la tabla con "esquema1.pacientes"
        String sql = "SELECT id, nombre FROM esquema1.pacientes";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("nombre")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}