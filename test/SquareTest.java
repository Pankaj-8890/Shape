import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test(expected = RuntimeException.class)
    public  void  testNegativeLength() {
        Square Square = new Square(-2 );
    }

    @Test
    public void testAreaWithSizeZeroShouldBeZero() {
        Square Square = new Square(0 );
        assertEquals(0, Square.area(), 0.001);
    }

    @Test
    public void testAreaWithSizeOneShouldBeOne() {
        Square Square = new Square(1 );
        assertEquals(1, Square.area(), 0.001);
    }

    @Test
    public void testAreaWithSizeThreeShouldBeNine() {
        Square Square = new Square(3);
        assertEquals(9, Square.area(), 0.001);
    }
    @Test
    public void testCircumferenceWithSizeZeroShouldBeZero() {
        Square Square = new Square(0 );
        assertEquals(0, Square.circumference(), 0.001);
    }

    @Test
    public void testCircumferenceWithSizeOneShouldBeFour() {
        Square Square = new Square(1 );
        assertEquals(4, Square.circumference(), 0.001);
    }

    @Test
    public void testCircumferenceWithSizeThreeShouldBeTwelve() {
        Square Square = new Square(3);
        assertEquals(12, Square.circumference(), 0.001);
    }
}