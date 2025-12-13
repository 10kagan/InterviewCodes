package Chain100Days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck (){
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck(){
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle (){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        if (cards.isEmpty()){
            throw new IllegalArgumentException("No cards left in the deck");
        }
        return cards.remove(0);
    }

    public int remainingCards(){
        return cards.size();
    }
}
