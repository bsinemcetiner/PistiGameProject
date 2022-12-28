import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Pisti {

    private Card[] Deck;
    public static void main (String [] args){

        String [] Suits = {"Spades ♠", "Clubs ♣" , "Hearts ♥", "Diamonds ♦"};
        String [] Cards = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        //String [] Deck = new String [52];
        Card [] Deck = new Card[52];

        int l = 0;
        for (int i=0; i < Suits.length; i++) {
            for (int j=0; j < Cards.length; j++) {
                Deck[l++] = new Card(Suits[i], Cards[j]);
                // System.out.println(Suits[i]+ " " + Cards[j]);
            }
        }

       /* for (int i=0; i< Deck.length; i++){
            Deck [i]= new Card (Suits[i/13], Cards[i%13]);
        }
        */

         Shuffle(Deck);
         for(int a = 0; a < Deck.length ; a++){
             System.out.println(Deck[a]);
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
    public static void Cut (Card [] Deck){
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        if (m>0 && m<=52){
            System.out.println("It is valid");
        } else {
            System.out.println("It is not valid");
        }
        Card [] k = new Card [52];
        for (int i=0; i< (Deck.length - m)+ 1; i++){
            k[Deck.length - m+i] = Deck[i];
        }
        for (int j=m; j< Deck.length; j++){
            k [j] = Deck[j-m];
        }
    }


    static ArrayList deckOfCards = new ArrayList (52);
    private static ArrayList FloorCards = new ArrayList();
    private static int User= 1;
    private static int Computer =1;
    private static int Floor =1;
    private static ArrayList UserCards = new ArrayList();
    private static ArrayList ComputerCards = new ArrayList();


    private static void deckOfCards(){
        System.out.println("All cards = " + deckOfCards);

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
        }
    }
    public static void DealCard(int dealTo) {
        for (int i = 0; i < 4; i++) {
            if (dealTo == Floor)
                FloorCards.add(deckOfCards.get(0));
            else if (dealTo == Computer)
                ComputerCards.add(deckOfCards.get(0));
            else if (dealTo == User)
                UserCards.add(deckOfCards.get(0));
            deckOfCards.remove(0);
        }

        if (dealTo == Floor) {
            System.out.println("Last card on the table " + FloorCards.get(FloorCards.size() - 1));

        } else if (dealTo == User) {
            System.out.println("You have " + UserCards);
        }
    }

}
/*      String [] Suits = new String [4];
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
        */   

/*Shuffle (Deck);
        int l = 0;
        for (int i=0; i< Suits.length; i++){
            for (int j=0; j< Cards.length; j++){
                Deck [l++] = new Card (Suits[i], Cards[j]);
                // System.out.println(Suits[i]+ " " + Cards[j]);
        System.out.println(Card);
*/
 /* for (int i=0; i<52; i++){
            System.out.println(Deck.dealCards());
            if (i%4==0){
                System.out.println();
            }
        }
        */