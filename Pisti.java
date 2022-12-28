import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pisti {
    private Card[] Deck;
    public static void main (String [] args){

        String [] Suits = {"Spades", "Clubs" , "Hearts", "Diamonds"};
        String [] Cards = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        //String [] Deck = new String [52];
        Card [] Deck = new Card[52];

        for (int i=0; i< Deck.length; i++){
            Deck [i]= new Card (Suits[i/13], (Cards[i%13]));

         Shuffle(Deck);
         for(int a = 0; a < Deck.length ; a++){
             System.out.println(Deck[a]);
         }

        }
    }
    public  static void Shuffle (Card[] Deck) {
        //String[] Deck = new String[52];
        Random r = new Random();
        for (int i=0; i<52; i++){
            int a = r.nextInt(52);
            int b = r.nextInt(52);
            Card temp = Deck[a];
            Deck[a] = Deck[b];
            Deck[b] = temp;
        }
    }



    static ArrayList deckOfCards = new ArrayList (52);
    private static void deckOfCards(){

        System.out.println("Cards are dealing");
        for (int i=0; i<53; i++){
            if (i>=0 && i<13){
               deckOfCards.add ("Spades : " + (i % 13 + 1));
            }else if (13 <= i && i < 26) {
                deckOfCards.add ("Hearts : " + (i % 13 + 1));
            } else if (26 <= i && i < 39) {
                deckOfCards.add("Diamonds : " + (i % 13 + 1));
            } else {
                deckOfCards.add("Clubs : " + (i % 13 + 1));
            }
        }Collections.shuffle(deckOfCards);
    }
}


/* String [] Suits = new String [4];
        Suits[0] = "Spades ♠";    // maça
        Suits[1] = "Clubs ♣";     // sinek
        Suits[2] = "Hearts ♥";    // kupa
        Suits[3] = "Diamonds ♦";  // elmas

        String [] Cards = new String [13];
        Cards[0] = "A";
        Cards[1] = "2";
        Cards[2] = "3";
        Cards[3] = "4";
        Cards[4] = "5";
        Cards[5] = "6";
        Cards[6] = "7";
        Cards[7] = "8";
        Cards[8] = "9";
        Cards[9] = "10";
        Cards[10] = "11";
        Cards[11] = "12";
        Cards[12] = "13";
        */   //System.out.println(Suits[i]+ " " + Cards[j]);

/*Shuffle (Deck);
        int l = 0;
        for (int i=0; i< Suits.length; i++){
            for (int j=0; j< Cards.length; j++){
                Deck [l++] = new Card (Suits[i], Cards[j]);
        System.out.println(Card);
*/

 /* String[] Jokers = new String[4];
        Jokers[0] = ("Spades 11");
        Jokers[1] = ("Hearts 11");
        Jokers[2] = ("Diamonds 11");
        Jokers[3] = ("Clubs 11");

        */