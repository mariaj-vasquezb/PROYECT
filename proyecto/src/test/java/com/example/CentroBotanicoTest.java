package com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CentroBotanicoTest {
    @Test
    public void testAgregarBotanico() {
       
        CentroBotanico centroBotanico = new CentroBotanico();
        Botanico botanico = new Botanico(123, null, null, null, null);
        centroBotanico.agregarBotanico(botanico);
        List<Botanico> botanicos = centroBotanico.getBotanicos();
        assertEquals(1, botanicos.size());
        assertEquals(botanico, botanicos.get(0));
    

    }
}
