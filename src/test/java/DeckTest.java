import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckShouldHave52Cards(){
        int total = 52;
        assertEquals(total, deck.getCardsRemaining());
    }

    @Test
    public void deckCanDealARandomCard() {
        Card firstCard = deck.deal();
        System.out.println(firstCard.getName());
        for (int i=0; i < 50; i++) {
            deck.deal();
        }
        Card lastCard = deck.deal();
        System.out.println(lastCard.getName());
        assertEquals(0, deck.getCardsRemaining());
    }

}
