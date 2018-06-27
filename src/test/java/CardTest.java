import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void aceHasValue1() {
        assertEquals(14, card.getValueFromEnum());
    }
}