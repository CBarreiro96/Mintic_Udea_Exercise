/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import java.util.Calendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author userx
 */
public class SillasTest {
    

    /**
     * Test of calcularPrecio method, of class .
     */
    @Test
    public void testCalcularPrecioSillaNormalDiaEnSemana() {
        Sillas sillaNormal = new Sillas(1, "image", Estado.DISPONIBLE);
        
        
        double precio = sillaNormal.calcularPrecio(Calendar.MONDAY);
        
        assertEquals(5_000, precio);
    }
                    
}
