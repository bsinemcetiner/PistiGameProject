import java.util.Scanner;
import java.util.Random;

public class Pisti {

    private Card[] Deck;

    public static void main(String[] args) {

        String[] Suits = {"Spades ♠", "Clubs ♣", "Hearts ♥", "Diamonds ♦"};
        String[] Cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Card[] Deck = new Card[52];

        int l = 0;
        for (int i = 0; i < Suits.length; i++) {
            for (int j = 0; j < Cards.length; j++) {
                Deck[l++] = new Card(Suits[i], Cards[j]);
                //System.out.println(Suits[i]+ " " + Cards[j]);
            }
        }

        Shuffle(Deck);
        for (int c = 0; c < 52; c++) {
            System.out.println(Deck[c]);
        }

        Cut(Deck);
        boolean bool = true;
        while (bool) {
            int m = 0;
            if (m >= 0 && m <= 52) {
                System.out.println("It is valid");
                for (int g = 0; g < Deck.length; g++) {
                    System.out.println(Deck[g]);
                }

            } else if (m < 0 || m > 52) {
                System.out.println("It is not valid");
            }
            bool = false;
        }
        //deckOfCards();
        //DealCard();

    }

    public static void Shuffle(Card[] Deck) {
        //String[] Deck = new String[52];
        Random r = new Random();
        for (int i = 0; i <= 52; i++) {
            int a = r.nextInt(52);
            int b = r.nextInt(52);
            Card temp = Deck[a];
            Deck[a] = Deck[b];
            Deck[b] = temp;
        }
    }

    public static void Cut(Card[] Deck) {
        Scanner sc = new Scanner(System.in);
        int m = 0;

        while (m >= 0 && m <= 52) {
            System.out.println("Enter the number you want to cut: ");
            m = sc.nextInt();
            break;

        }
        Card[] k = new Card[52];
        for (int i = 0; i < (Deck.length - m) + 1; i++) {
            k[Deck.length - m] = Deck[i];
        }
        for (int j = m; j < Deck.length; j++) {
            k[j] = Deck[j - m];
        }

    }
}



   /* private static final int [] deckOfCards = new int[52];
    private static final String  [] FloorCards = new String[4];
    private static final int User= 1;
    private static final int Computer =1;
    private static final int Floor =1;
    private static final String [] UserCards = new String[4];
    private static final String [] ComputerCards = new String [4];


    private static void deckOfCards(){
        System.out.println("All cards = 52 ");
        System.out.println("All cards are dealing");

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
    public static void DealCard() {
        int dealTo= 0;
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

 /* for (int i=0; i<52; i++){
            System.out.println(Deck.dealCards());
            if (i%4==0){
                System.out.println();
            }
        }
        */
//dealCard (int dealTo){

/*do {
        System.out.println("Enter the number you want to cut:");
        m = sc.nextInt();
        if (m >= 0 && m <= 52) {
        System.out.println("It is valid");
        }
        } while (m >= 0 && m <= 52);

 */
