package com.example;

import java.util.List;

public class Cuidado {
    private String area;
    private String fechaHora;
    private List<Planta> plantas;
    private List<Botanico> botanicos;
    private String resultado;
    private String estado;

    public Cuidado(String area, String fechaHora, List<Planta> plantas, List<Botanico> botanicos) {
        this.area = area;
        this.fechaHora = fechaHora;
        this.plantas = plantas;
        this.botanicos = botanicos;
        this.estado = "PENDIENTE";
    }

    public String getArea() {
        return area;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public List<Botanico> getBotanicos() {
        return botanicos;
    }

    public String getResultado() {
        return resultado;
    }

    public String getEstado() {
        return estado;
    }

    public void iniciarCuidado() {
        estado = "EN PROCESO";
    }

    public void finalizarCuidado(String resultado) {
        estado = "FINALIZADO";
        this.resultado = resultado;
    }

    public void aplazarCuidado() {
        estado = "APLAZADO";
    }
}