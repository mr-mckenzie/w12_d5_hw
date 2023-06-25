import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
    private Card dealtCard;


    public Deck () {
        deck = new ArrayList<>();
        deck.add(new Card(Suit.DIAMONDS, Value.TWO));
        deck.add(new Card(Suit.DIAMONDS, Value.THREE));
        deck.add(new Card(Suit.DIAMONDS, Value.FOUR));
        deck.add(new Card(Suit.DIAMONDS, Value.FIVE));
        deck.add(new Card(Suit.DIAMONDS, Value.SIX));
        deck.add(new Card(Suit.DIAMONDS, Value.SEVEN));
        deck.add(new Card(Suit.DIAMONDS, Value.EIGHT));
        deck.add(new Card(Suit.DIAMONDS, Value.NINE));
        deck.add(new Card(Suit.DIAMONDS, Value.TEN));
        deck.add(new Card(Suit.DIAMONDS, Value.JACK));
        deck.add(new Card(Suit.DIAMONDS, Value.QUEEN));
        deck.add(new Card(Suit.DIAMONDS, Value.KING));
        deck.add(new Card(Suit.DIAMONDS, Value.ACEHIGH));
        deck.add(new Card(Suit.CLUBS, Value.TWO));
        deck.add(new Card(Suit.CLUBS, Value.THREE));
        deck.add(new Card(Suit.CLUBS, Value.FOUR));
        deck.add(new Card(Suit.CLUBS, Value.FIVE));
        deck.add(new Card(Suit.CLUBS, Value.SIX));
        deck.add(new Card(Suit.CLUBS, Value.SEVEN));
        deck.add(new Card(Suit.CLUBS, Value.EIGHT));
        deck.add(new Card(Suit.CLUBS, Value.NINE));
        deck.add(new Card(Suit.CLUBS, Value.TEN));
        deck.add(new Card(Suit.CLUBS, Value.JACK));
        deck.add(new Card(Suit.CLUBS, Value.QUEEN));
        deck.add(new Card(Suit.CLUBS, Value.KING));
        deck.add(new Card(Suit.CLUBS, Value.ACEHIGH));
        deck.add(new Card(Suit.HEARTS, Value.TWO));
        deck.add(new Card(Suit.HEARTS, Value.THREE));
        deck.add(new Card(Suit.HEARTS, Value.FOUR));
        deck.add(new Card(Suit.HEARTS, Value.FIVE));
        deck.add(new Card(Suit.HEARTS, Value.SIX));
        deck.add(new Card(Suit.HEARTS, Value.SEVEN));
        deck.add(new Card(Suit.HEARTS, Value.EIGHT));
        deck.add(new Card(Suit.HEARTS, Value.NINE));
        deck.add(new Card(Suit.HEARTS, Value.TEN));
        deck.add(new Card(Suit.HEARTS, Value.JACK));
        deck.add(new Card(Suit.HEARTS, Value.QUEEN));
        deck.add(new Card(Suit.HEARTS, Value.KING));
        deck.add(new Card(Suit.HEARTS, Value.ACEHIGH));
        deck.add(new Card(Suit.SPADES, Value.TWO));
        deck.add(new Card(Suit.SPADES, Value.THREE));
        deck.add(new Card(Suit.SPADES, Value.FOUR));
        deck.add(new Card(Suit.SPADES, Value.FIVE));
        deck.add(new Card(Suit.SPADES, Value.SIX));
        deck.add(new Card(Suit.SPADES, Value.SEVEN));
        deck.add(new Card(Suit.SPADES, Value.EIGHT));
        deck.add(new Card(Suit.SPADES, Value.NINE));
        deck.add(new Card(Suit.SPADES, Value.TEN));
        deck.add(new Card(Suit.SPADES, Value.JACK));
        deck.add(new Card(Suit.SPADES, Value.QUEEN));
        deck.add(new Card(Suit.SPADES, Value.KING));
        deck.add(new Card(Suit.SPADES, Value.ACEHIGH));
    }

    public int getCardsRemaining() {
        return this.deck.size();
    }


    public Card deal() {
        Random random = new Random();
        int cardsRemaining = this.getCardsRemaining();
        if (cardsRemaining > 0) {
            dealtCard = this.deck.get(random.nextInt(cardsRemaining));
        } else {
            System.out.println("Deck Empty!");
        }
        this.deck.remove(dealtCard);
        return dealtCard;
    }
}
