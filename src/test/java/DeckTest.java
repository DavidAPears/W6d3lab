import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void countCards(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void addCards(){
        deck.addCards();
        assertEquals(52, deck.countCards());
    }

}
