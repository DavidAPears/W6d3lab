import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> mydeck;

    public Deck(){
        this.mydeck = new ArrayList<>();
    }

    public int countCards() {
        return this.mydeck.size();
    }
}
