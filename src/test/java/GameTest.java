import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void before(){
        game = new Game();
        player1 = new Player("George");
        player2 = new Player("Sally");
        deck = new Deck();

        deck.addCards();
        deck.shuffleDeck();
    }

    @Test
    public void newGame(){
        player1.pickCardFromDeck(deck);
        player2.pickCardFromDeck(deck);
        game.playGame(player1, player2);
    }

}
