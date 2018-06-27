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
        card = new Card(SuitType.CLUBS, RankType.EIGHT);

        deck.addCards();
        deck.shuffleDeck();
    }

    @Test
    public void hasCard(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void addCard(){
        player.addCard(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void playerPicksCard(){
        player.pickCardFromDeck(deck);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void calculateHand(){
        player.addCard(card);
        assertEquals(8, player.cardValueFromEnum());
    }

}
