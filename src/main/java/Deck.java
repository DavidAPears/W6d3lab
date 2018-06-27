import java.util.ArrayList;

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
}
