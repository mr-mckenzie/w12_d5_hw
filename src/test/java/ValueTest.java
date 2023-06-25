import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValueTest {

    private Value aceLow;
    private Value two;
    private Value three;
    private Value four;
    private Value five;
    private Value six;
    private Value seven;
    private Value eight;
    private Value nine;
    private Value ten;
    private Value jack;
    private Value queen;
    private Value king;
    private Value aceHigh;

    @Before
    public void before() {
        aceLow = Value.ACELOW;
        two = Value.TWO;
        three = Value.THREE;
        four = Value.FOUR;
        five = Value.FIVE;
        six = Value.SIX;
        seven = Value.SEVEN;
        eight = Value.EIGHT;
        nine = Value.NINE;
        ten = Value.TEN;
        jack = Value.JACK;
        queen = Value.QUEEN;
        king = Value.KING;
        aceHigh = Value.ACEHIGH;
    }

    @Test public void valueHasName() {
        assertEquals("Ace", aceHigh.getName());
        assertEquals("Ace", aceLow.getName());
    }

    @Test public void valuehasValue() {
        assertEquals(10, king.getValue());
        assertEquals(1, aceLow.getValue());
        assertEquals(11, aceHigh.getValue());
    }

}
