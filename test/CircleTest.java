import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest{

    @Test(expected = RuntimeException.class)
    public  void  testNegativeRadius() {
        Circle circle = new Circle(-10 );
    }

    @Test
    public void testZeroArea() {
        Circle circle = new Circle(0 );
        assertEquals(0, circle.area(),0.001);
    }

    @Test
    public void testZeroCircumference() {
        Circle circle = new Circle(0 );
        assertEquals(0, circle.circumference(),0.001);
    }

    @Test
    public void testAreaWithRadiusOne() {
        Circle circle = new Circle(1 );
        assertEquals(Math.PI, circle.area(),0.001);
    }

    @Test
    public void testCircumferenceRadiusOne() {
        Circle circle = new Circle(1 );
        assertEquals(2 * Math.PI, circle.circumference(),0.001);
    }

    @Test
    public void testAreaWithRadiusFive() {
        Circle circle = new Circle(5 );
        assertEquals(78.53981, circle.area(),0.001);
    }

    @Test
    public void testCircumferenceWithRadiusFive() {
        Circle circle = new Circle(5 );
        assertEquals(31.4159 , circle.circumference(),0.001);
    }

}