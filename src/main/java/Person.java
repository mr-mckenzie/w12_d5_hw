import java.util.ArrayList;

public abstract class Person {

    private String name;
    private ArrayList<Card> hand;

    public Person (String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void receiveCard(Card dealtCard) {
        hand.add(dealtCard);
    }

    public int getHandTotal() {
        int total = 0;
        for (int i = 0; i < hand.size(); i++) {
            total += hand.get(i).getValue();
        }
        return total;

    }
}
