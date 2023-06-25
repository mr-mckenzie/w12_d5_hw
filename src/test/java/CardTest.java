import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    public Card aceOfClubs;
    public Card threeOfHearts;
    public Card nineOfDiamonds;
    public Card jackOfSpades;

    @Before
    public void before() {
        threeOfHearts = new Card(Suit.HEARTS, Value.THREE);
        aceOfClubs = new Card(Suit.CLUBS, Value.ACEHIGH);
        nineOfDiamonds = new Card(Suit.DIAMONDS, Value.NINE);
        jackOfSpades = new Card(Suit.SPADES, Value.JACK);
    }

    @Test
    public void cardHasValue() {
        assertEquals(3, threeOfHearts.getValue());
        assertEquals(11, aceOfClubs.getValue());
        assertEquals(9, nineOfDiamonds.getValue());
        assertEquals(10, jackOfSpades.getValue());
    }

    @Test
    public void cardHasSuitValue() {
        assertEquals(4, jackOfSpades.getSuitValue());
        assertEquals(3, threeOfHearts.getSuitValue());
        assertEquals(2, aceOfClubs.getSuitValue());
        assertEquals(1, nineOfDiamonds.getSuitValue());
    }

    @Test
    public void cardHasName() {
        assertEquals("Ace of Clubs", aceOfClubs.getName());
        assertEquals("Nine of Diamonds", nineOfDiamonds.getName());
        assertEquals("Three of Hearts", threeOfHearts.getName());
        assertEquals("Jack of Spades", jackOfSpades.getName());
    }
}
