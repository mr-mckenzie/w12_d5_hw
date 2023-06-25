public class Runner {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player playerWalter = new Player("Walter");
        Dealer dealerTanya = new Dealer("Tanya");

        dealerTanya.startGame(playerWalter);
        dealerTanya.checkForTwist();
        dealerTanya.compareHands(playerWalter);

    }
}