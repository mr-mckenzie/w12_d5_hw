import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuitTest {

    private Suit spades;
    private Suit hearts;
    private Suit clubs;
    private Suit diamonds;

    @Before
    public void before() {
        spades = Suit.SPADES;
        hearts = Suit.HEARTS;
        clubs = Suit.CLUBS;
        diamonds = Suit.DIAMONDS;
    }

    @Test
    public void suitShouldHaveName() {
        assertEquals("Spades", spades.getName());
        assertEquals("Hearts", hearts.getName());
        assertEquals("Clubs", clubs.getName());
        assertEquals("Diamonds", diamonds.getName());
    }

    @Test
    public void suitShouldHaveValue() {
        assertEquals(4, spades.getValue());
        assertEquals(3, hearts.getValue());
        assertEquals(2, clubs.getValue());
        assertEquals(1, diamonds.getValue());
    }

}
