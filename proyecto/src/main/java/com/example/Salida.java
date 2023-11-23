package com.example;

import java.util.ArrayList;
import java.util.List;

public class Salida {
    public static void main(String[] args) {
        CentroBotanico centroBotanico = new CentroBotanico();

        // Agregar plantas
        Planta cerezo = new Planta("Flor de cerezo", "Flor");
        Planta arbol = new Planta("Árbol", "Árboles");
        centroBotanico.agregarPlanta(cerezo);
        centroBotanico.agregarPlanta(arbol);

        // Agregar botánicos
        Botanico botanico1 = new Botanico(1, "Mario", "Pérez", "juan@example.com", "123456789");
        Botanico botanico2 = new Botanico(2, "Jose", "Gómez", "maria@example.com", "987654321");
        centroBotanico.agregarBotanico(botanico1);
        centroBotanico.agregarBotanico(botanico2);

        // Programar cuidados
        List<Planta> plantasCuidado1 = new ArrayList<>();
        plantasCuidado1.add(cerezo);
        List<Botanico> botanicosCuidado1 = new ArrayList<>();
        botanicosCuidado1.add(botanico1);

        centroBotanico.programarCuidado("Área 1", "2023-01-01 10:00", plantasCuidado1, botanicosCuidado1);

        List<Planta> plantasCuidado2 = new ArrayList<>();
        plantasCuidado2.add(arbol);
        List<Botanico> botanicosCuidado2 = new ArrayList<>();
        botanicosCuidado2.add(botanico2);

        centroBotanico.programarCuidado("Área 2", "2023-02-01 15:00", plantasCuidado2, botanicosCuidado2);

        // Realizar cuidados
        centroBotanico.iniciarCuidado("Área 1", "2023-01-01 10:00");
        centroBotanico.finalizarCuidado("Área 1", "2023-01-01 10:00", "Buena salud, crecimiento normal");

        // Obtener información
        List<Cuidado> cuidadosPlantaSuculenta = centroBotanico.getCuidadosPorPlanta("Flor de cerezo");
        System.out.println("Cuidados para la planta de cerezo:");
        for (Cuidado cuidado : cuidadosPlantaSuculenta) {
            System.out.println(cuidado.getFechaHora() + " - " + cuidado.getEstado());
        }

        List<Cuidado> cuidadosBotanicoJuan = centroBotanico.getCuidadosPorBotanico(1);
        System.out.println("Cuidados en los que participa el botánico Mario:");
        for (Cuidado cuidado : cuidadosBotanicoJuan) {
            System.out.println(cuidado.getFechaHora() + " - " + cuidado.getEstado());
        }

        // Mostrar estadísticas
        centroBotanico.mostrarEstadisticasCuidados();
    }
}