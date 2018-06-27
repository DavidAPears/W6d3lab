import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card;

    @Before
    public void before(){
        player = new Player("Fred");
        deck = new Deck();

        deck.addCards();
    }

    @Test
    public void hasCard(){
        assertEquals(0, player.cardCount());
    }

//    @Test
//    public void canPickCard(){
//
//    }


}
