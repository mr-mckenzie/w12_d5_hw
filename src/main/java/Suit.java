public enum Suit {
    SPADES("Spades", 4),
    HEARTS("Hearts", 3),
    CLUBS("Clubs", 2),
    DIAMONDS("Diamonds", 1);

    private final String suit;
    private final int value;

    Suit(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public String getName() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }
}
