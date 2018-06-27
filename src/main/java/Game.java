public class Game {
    private Player player1;
    private Player player2;
    private Deck mydeck;


    public Game(){
        this.player1 = new Player("Fred");
        this.player2 = new Player("Jessica");
        this.mydeck = new Deck();

    }

    public Player playGame(Player player1, Player player2){
        if (player1.cardValueFromEnum() > player2.cardValueFromEnum())
            return player1;
          else if (player1.cardValueFromEnum() < player2.cardValueFromEnum())
            return player2;
          else
            return null;
    }

    public Player playGameTwoCards(Player player1, Player player2){
        if (player1.cardValueFromEnumTwoCards() > player2.cardValueFromEnumTwoCards())
            return player1;
        else if (player1.cardValueFromEnumTwoCards() < player2.cardValueFromEnumTwoCards())
            return player2;
        else
            return null;
    }
}
