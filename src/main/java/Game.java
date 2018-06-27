public class Game {
    private Player player1;
    private Player player2;
    private Deck mydeck;


    public Game(){
        this.player1 = new Player("Fred");
        this.player2 = new Player("Jessica");
        this.mydeck = new Deck();

    }

    public void playGame(Player player1, Player player2){
        if (player1.cardValueFromEnum() > player2.cardValueFromEnum())
            System.out.println("Player 1 WINS");
          else if (player1.cardValueFromEnum() < player2.cardValueFromEnum())
            System.out.println("Player 2 WINS");
          else if (player1.cardValueFromEnum() == player2.cardValueFromEnum())
            System.out.println("DRAW!");
    }
}
