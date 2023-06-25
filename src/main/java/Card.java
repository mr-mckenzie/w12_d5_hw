public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }


    public int getValue() {
        return this.value.getValue();
    }

    public String getName() {
        return this.value.getName() + " of " + this.suit.getName();
    }

    public int getSuitValue() {
        return this.suit.getValue();
    }
}
