package com.example.gestorcitas2;

public class Paciente {
    private int idPaciente;
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String password;

    // Constructor vacío
    public Paciente() {}

    // Constructor con parámetros (sin idPaciente para inserciones)
    public Paciente(String dni, String nombre, String direccion, String telefono, String email, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

    // Constructor completo (para lecturas de base de datos)
    public Paciente(int idPaciente, String dni, String nombre, String direccion, String telefono, String email, String password) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

    // Getters y Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return