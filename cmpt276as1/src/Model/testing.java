package Model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

class CalculatorTest {
    private static final double COC = 0.029;

    Lens t1 = new Lens("Canon", 1.8, 50);
    Lens t2 = new Lens("Tamron", 2.8, 90);
    Lens t3 = new Lens("Sigma", 2.8, 200);
    Lens t4 = new Lens("Nikon", 4, 200);
    Lens t5 = new Lens("ElCheepo", 12, 24);
    Lens t6 = new Lens("Leica", 5.6, 1600);
    Lens t7 = new Lens("TheWide", 1.0, 16);
    Lens t8 = new Lens("IWish", 1.0, 200);

    private String formatM(double distanceInM) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(distanceInM);
    }

    @Test
    void TestCanon(){
        Calculator c1 = new Calculator(t1,5,5);
        assertEquals(50, c1.hyperfocal_distance()/1000,0.01);

        assertEquals("infinity", formatM(c1.near_focal_point()/1000));

        assertEquals("-1.0", formatM(c1.far_focal_point()/1000));

        assertEquals("21", formatM(c1.depth_field()/1000));
    }
    @Test
    void TestTamron(){
        Calculator c2 = new Calculator(t2,5,5);
        assertEquals(50, c2.hyperfocal_distance()/1000,0.01);

        assertEquals("infinity", formatM(c2.near_focal_point()/1000));

        assertEquals("-1.0", formatM(c2.far_focal_point()/1000));

        assertEquals("21", formatM(c2.depth_field()/1000));
    }
    @Test
    void TestSigma(){
        Calculator c3 = new Calculator(t3,5,5);
        assertEquals(50, c3.hyperfocal_distance()/1000,0.01);

        assertEquals("infinity", formatM(c3.near_focal_point()/1000));

        assertEquals("-1.0", formatM(c3.far_focal_point()/1000));

        assertEquals("21", formatM(c3.depth_field()/1000));
    }
    @Test
    void TestNikon(){
        Calculator c4 = new Calculator(t4,5,5);
        assertEquals(50, c4.hyperfocal_distance()/1000,0.01);

        assertEquals("infinity", formatM(c4.near_focal_point()/1000));

        assertEquals("-1.0", formatM(c4.far_focal_point()/1000));

        assertEquals("21", formatM(c4.depth_field()/1000));
    }
    @Test
    void TestElCheepo(){
        Calculator c5 = new Calculator(t5,5,5);
        assertEquals(50, c5.hyperfocal_distance()/1000,0.01);

        assertEquals("infinity", formatM(c5.near_focal_point()/1000));

        assertEquals("-1.0", formatM(c5.far_focal_point()/1000));

        assertEquals("21", formatM(c5.depth_field()/1000));
    }
    @Test
    void TestLeica(){
        Calculator c6 = new Calculator(t6,5,5);
        assertEquals(50, c6.hyperfocal_distance()/1000,0.01);

        assertEquals("infinity", formatM(c6.near_focal_point()/1000));

        assertEquals("-1.0", formatM(c6.far_focal_point()/1000));

        assertEquals("21", formatM(c6.depth_field()/1000));
    }
    @Test
    void TestTheWide(){
        Calculator c7 = new Calculator(t7,5,5);
        assertEquals(50, c7.hyperfocal_distance()/1000,0.01);

        assertEquals("infinity", formatM(c7.near_focal_point()/1000));

        assertEquals("-1.0", formatM(c7.far_focal_point()/1000));

        assertEquals("21", formatM(c7.depth_field()/1000));
    }
}