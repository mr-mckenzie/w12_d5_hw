import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player playerOne;
    private Deck deck;
    private Card firstDealtCard;
    private Card secondDealtCard;

    @Before
    public void before() {
        playerOne = new Player("Agatha");
        deck = new Deck();
    }

    @Test
    public void playerHasName() {
        assertEquals("Agatha", this.playerOne.getName());
    }

    @Test
    public void playerStartsWithEmptyHand() {
        assertEquals(0, playerOne.getHand().size());
    }

    @Test
    public void playerCanReceiveCards() {
        firstDealtCard = deck.deal();
        playerOne.receiveCard(firstDealtCard);
        secondDealtCard = deck.deal();
        playerOne.receiveCard(secondDealtCard);
        ArrayList<Card> playerHand = new ArrayList<>();
        playerHand.add(firstDealtCard);
        playerHand.add(secondDealtCard);
        assertEquals(2, playerOne.getHand().size());
        assertEquals(playerHand, playerOne.getHand());
    }

    @Test
    public void playerCanGetHandTotal() {
        Card twoOfSpades = new Card(Suit.SPADES, Value.TWO);
        Card queenOfClubs = new Card(Suit.CLUBS, Value.QUEEN);
        playerOne.receiveCard(twoOfSpades);
        playerOne.receiveCard(queenOfClubs);
        assertEquals(12, playerOne.getHandTotal());
    }

}
