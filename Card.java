import java.util.Random;

public class Card {
    private String Suits;
    private String Cards;
    private Card[] Deck;
    public Card(String S, String C) {
        Suits = S;
        Cards = C;
    }
    public String toString(){

        return Suits + Cards;
    }

    public Card dealCards() {
        int currentCard=0;
        if (currentCard < Deck.length){
            return Deck[currentCard++];
        } else {
            return null;
        }
    }

}

//String [] Suits = {"Spades", "Clubs" , "Hearts", "Diamonds"};
//String [] Cards = {"A","2","3","4","5","6","7","8","9","J","Q","K"};