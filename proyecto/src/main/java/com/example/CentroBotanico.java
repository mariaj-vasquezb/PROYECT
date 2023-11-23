package com.example;

import java.util.ArrayList;
import java.util.List;

public class CentroBotanico {
    private List<Planta> plantas;
    private List<Botanico> botanicos;
    private List<Cuidado> cuidados;

    public CentroBotanico() {
        plantas = new ArrayList<>();
        botanicos = new ArrayList<>();
        cuidados = new ArrayList<>();
    }

    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void agregarBotanico(Botanico botanico) {
        botanicos.add(botanico);
    }
//este método se encarga de programar un cuidado para un área específica, en una fecha y hora determinadas, con la participación de ciertas plantas y botánicos. Este cuidado programado se registra en la lista de cuidados del centro botánico.
    public void programarCuidado(String area, String fechaHora, List<Planta> plantas, List<Botanico> botanicos) {
        Cuidado cuidado = new Cuidado(area, fechaHora, plantas, botanicos);
        cuidados.add(cuidado);
    }

    public void iniciarCuidado(String area, String fechaHora) {
        for (Cuidado cuidado : cuidados) {
            if (cuidado.getArea().equals(area) && cuidado.getFechaHora().equals(fechaHora)) {
                cuidado.iniciarCuidado();
            }
        }
    }

    public void finalizarCuidado(String area, String fechaHora, String resultado) {
        for (Cuidado cuidado : cuidados) {
            if (cuidado.getArea().equals(area) && cuidado.getFechaHora().equals(fechaHora)) {
                cuidado.finalizarCuidado(resultado);
            }
        }
    }

    public void aplazarCuidado(String area, String fechaHora) {
        for (Cuidado cuidado : cuidados) {
            if (cuidado.getArea().equals(area) && cuidado.getFechaHora().equals(fechaHora)) {
                cuidado.aplazarCuidado();
            }
        }
    }

    public List<Cuidado> getCuidadosPorPlanta(String nombrePlanta) {
        List<Cuidado> cuidadosPlanta = new ArrayList<>();
        for (Cuidado cuidado : cuidados) {
            for (Planta planta : cuidado.getPlantas()) {
                if (planta.getNombre().equals(nombrePlanta)) {
                    cuidadosPlanta.add(cuidado);
                    break;
                }
            }
        }
        return cuidadosPlanta;
    }

    public List<Cuidado> getCuidadosPorBotanico(int licenciaBotanico) {
        List<Cuidado> cuidadosBotanico = new ArrayList<>();
        for (Cuidado cuidado : cuidados) {
            for (Botanico botanico : cuidado.getBotanicos()) {
                if (botanico.getLicencia() == licenciaBotanico) {
                    cuidadosBotanico.add(cuidado);
                    break;
                }
            }
        }
        return cuidadosBotanico;
    }

    public void mostrarEstadisticasCuidados() {
        int totalRealizados = 0;
        int totalPendientes = 0;
        int totalAplazados = 0;

        for (Cuidado cuidado : cuidados) {
            switch (cuidado.getEstado()) {
                case "FINALIZADO":
                    totalRealizados++;
                    break;
                case "PENDIENTE":
                    totalPendientes++;
                    break;
                case "APLAZADO":
                    totalAplazados++;
                    break;
            }
        }

        System.out.println("Estadísticas de cuidados:");
        System.out.println("Total realizados: " + totalRealizados);
        System.out.println("Total pendientes: " + totalPendientes);
        System.out.println("Total aplazados: " + totalAplazados);
    }

    public List<Botanico> getBotanicos() {
        return botanicos;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }
    
}
