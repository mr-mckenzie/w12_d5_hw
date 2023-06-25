import java.sql.SQLOutput;

public class Dealer extends Person{

    private Deck deck;

    public Dealer(String name) {
        super(name);
        this.deck = new Deck();
    }


    public Card dealCard(Person person) {
        Card dealtCard = this.deck.deal();
        person.receiveCard(dealtCard);
        return dealtCard;
    }

    public Person compareHands(Player player) {
        int dealerTotal = this.getHandTotal();
        System.out.println("Dealer " + this.getName() + " has " + this.getHandTotal() + ".");
        int playerTotal = player.getHandTotal();
        System.out.println("Player " + player.getName() + " has " + player.getHandTotal() + ".");
        if (dealerTotal <= 21 && playerTotal <= 21) {
            if (dealerTotal >= playerTotal) {
                System.out.println("Dealer wins.");
                return this;
            } else {
                System.out.println(player.getName() + " wins!");
                return player;
            }
        } else if (dealerTotal <= 21 && playerTotal > 21) {
            System.out.println(player.getName() + " is bust. Dealer wins.");
            return this;
        } else if (playerTotal <= 21 && dealerTotal > 21) {
            System.out.println("Dealer is bust. " + player.getName() + " wins!");
            return player;
        } else {
            System.out.println("Player and Dealer are both bust, Dealer wins by default!");
            return this;
        }
    }

    public void startGame(Player player) {
        Card playerCardOne = dealCard(player);
        dealCard(this);
        Card playerCardTwo = dealCard(player);
        System.out.println("Player " + player.getName() + "'s hand is: the " + playerCardOne.getName() + " and the " + playerCardTwo.getName() + ".");
        System.out.println("Player " + player.getName() + "'s total is: " + player.getHandTotal());
        Card dealerCard = dealCard(this);
        System.out.println("Dealer's face-up card is: " + dealerCard.getName());
    }


    public void checkForTwist() {
        while (this.getHandTotal() < 16){
            Card twistCard = this.dealCard(this);
            System.out.println("Dealer " + this.getName() + " twists: " + twistCard.getName());
        }
    }
}
