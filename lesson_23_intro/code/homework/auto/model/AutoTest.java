package homework.auto.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AutoTest
{
    private static Auto[] autos = new Auto[5];

    private static final double D = 1.6;
    private static final double B = 1.8;
    public static final double kilometers = 3000;

    @BeforeEach
    void setUp()
    {
        autos[0] = new Auto ("Audi", "d", D, 6.6, 45.0);
        autos[1] = new Auto("BMW", "b", B, 6.8, 49.0);
        autos[2] = new Auto("Opel", "d", D, 6.9, 45.0);
        autos[3] = new Auto("VW", "d", D, 6.5, 39.0);
        autos[4] = new Auto("Mercedes", "b", B, 6.3, 49.0);
    }

    @Test
    void isOptimalAuto()
    {
        assertEquals("VW", Auto.isOptimalAuto(autos, kilometers).getCarBrand());
    }
    @Test

    void isNoOptimalAuto()
    {
        assertNotEquals("Mercedes", Auto.isOptimalAuto(autos, kilometers).getCarBrand());
    }


}