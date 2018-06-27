import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> mydeck;

    public Deck(){
        this.mydeck = new ArrayList<>();
    }

    public int countCards() {
        return this.mydeck.size();
    }

    public void addCards() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                this.mydeck.add(card);
            }
        }
    }

    public Card removeChosenCardForPlayer() {
        return this.mydeck.remove(0);
    }

    public void shuffleDeck(){
        Collections.shuffle(mydeck);
    }
}
