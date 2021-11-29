import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

public class KaloriTest {
    kalori kalori;

    @BeforeEach
    void setUp(){
        kalori = new kalori();
    }

    @Test
    void calcWomenTest(){
        double weight = 60;
        double height = 160;
        int age = 30;
        double expectedWomen = 1368.193;

        double actualWomen = this.kalori.calcWomen(weight, height, age);

        assertEquals(expectedWomen, actualWomen);
    }

    @Test
    void calcMenTest(){
        double weight = 30;
        double height = 35;
        int age = 50;
        double expectedMen = 374.88700000000006;

        double actualMen = this.kalori.calcMen(weight, height, age);

        assertEquals(expectedMen, actualMen);
    }
    @Test
    void calcWomenTest1(){
        double weight = 60;
        double height =150;
        int age = 30;
        double expectedWomen = 1337.213;

        double actualWomen = this.kalori.calcWomen(weight, height, age);

        assertEquals(expectedWomen, actualWomen);
    }

    @Test
    void calcMenTest1(){
        double weight = 30;
        double height = 105;
        int age = 50;
        double expectedMen = 710.8170000000001;

        double actualMen = this.kalori.calcMen(weight, height, age);

        assertEquals(expectedMen, actualMen);
    }
    @Test
    void testGeneralException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
                kalori.calcMen(0, 0, 0);
            });
        assertEquals("Hiba! ez az érték nem jó!", exception.getMessage());
    }
    void testGeneralException1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            kalori.calcWomen(0, 0, 0);
            });
        assertEquals("Hiba! ez az érték nem jó!", exception.getMessage());
    }
    


    
}
