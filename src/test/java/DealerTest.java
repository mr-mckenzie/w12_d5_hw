import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dudley;
    Player jurgen;
    Card threeOfSpades;
    Card nineOfClubs;
    Card sevenOfClubs;
    Card jackOfClubs;
    Card tenOfHearts;
    Card nineOfSpades;

    @Before
    public void before() {
    dudley = new Dealer("Dudley");
    jurgen = new Player("Jürgen");

    threeOfSpades = new Card(Suit.SPADES, Value.THREE);
    nineOfClubs = new Card(Suit.CLUBS, Value.NINE);
    sevenOfClubs = new Card(Suit.CLUBS, Value.SEVEN);
    jackOfClubs = new Card(Suit.CLUBS, Value.JACK);
    tenOfHearts = new Card(Suit.HEARTS, Value.TEN);
    nineOfSpades = new Card(Suit.SPADES, Value.NINE);
}

    @Test
    public void dealerHasName() {
       assertEquals("Dudley", dudley.getName());
    }

    @Test
    public void dealerCanDealCardToPlayer() {
        dudley.dealCard(jurgen);
        assertEquals(1, jurgen.getHand().size());
    }

    @Test
    public void dealerCanCompareHands__playerHasHighHand() {
        dudley.receiveCard(threeOfSpades);
        dudley.receiveCard(nineOfClubs);
        jurgen.receiveCard(sevenOfClubs);
        jurgen.receiveCard(jackOfClubs);
        assertEquals(jurgen, dudley.compareHands(jurgen));
    }

    @Test
    public void dealerCanCompareHands__dealerHasHighHand() {
        dudley.receiveCard(tenOfHearts);
        dudley.receiveCard(nineOfClubs);
        jurgen.receiveCard(sevenOfClubs);
        jurgen.receiveCard(jackOfClubs);
        assertEquals(dudley, dudley.compareHands(jurgen));
    }

    @Test
    public void dealerCanCompareHands__dealerHasSameHandTotal() {

        dudley.receiveCard(tenOfHearts);
        dudley.receiveCard(nineOfClubs);
        jurgen.receiveCard(nineOfSpades);
        jurgen.receiveCard(jackOfClubs);
        assertEquals(dudley, dudley.compareHands(jurgen));
    }

    @Test
    public void dealerCanCompareHands__playerHasBustTotal() {

        Card kingOfDiamonds = new Card(Suit.DIAMONDS, Value.KING);


        dudley.receiveCard(tenOfHearts);
        dudley.receiveCard(nineOfClubs);
        jurgen.receiveCard(nineOfSpades);
        jurgen.receiveCard(jackOfClubs);
        jurgen.receiveCard(kingOfDiamonds);
        assertEquals(dudley, dudley.compareHands(jurgen));
    }

    @Test
    public void dealerCanStartGameByDealingTwoCards() {
        dudley.startGame(jurgen);
        assertEquals(2,jurgen.getHand().size());
        assertEquals(2, dudley.getHand().size());
    }

    @Test
    public void dealerTwistsBasedOnHandTotal__willTwist() {
        dudley.receiveCard(threeOfSpades);
        dudley.receiveCard(sevenOfClubs);
        dudley.checkForTwist();
        assertEquals(3, dudley.getHand().size());
    }

    @Test
    public void dealerTwistsBasedOnHandTotal__willNotTwist() {
        dudley.receiveCard(nineOfClubs);
        dudley.receiveCard(jackOfClubs);
        dudley.checkForTwist();
        assertEquals(2, dudley.getHand().size());
    }

}
