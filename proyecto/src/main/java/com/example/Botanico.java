package com.example;

public class Botanico {
    private int licencia;
    private String nombre;
    private String apellido;
    private String email;
    private String numeroCelular;
    
public Botanico(int licencia, String nombre, String apellido, String email, String numeroCelular) {
        this.licencia = licencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getLicencia() {
        return licencia;
    }

    public String getNombre() {
        return nombre;
    }
    
}
