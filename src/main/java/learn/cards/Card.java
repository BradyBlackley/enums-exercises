package learn.cards;

public class Card {

    // 1. Add a Suit and Rank field the Card class.
    // 2. Add a constructor that accepts a Suit and Rank and sets the appropriate fields.
    // 3. Add getters for both suit and rank.
    public Suit suit;
    public Rank rank;


    public enum Suit {
        CLUBS("Clubs"),
        HEARTS("Hearts"),
        DIAMONDS("Diamonds"),
        SPADES("Spades");

        public String getName(){
            return this.name;
        }

        private final String name;

        Suit(String name){
            this.name = name;
        }
    }

    public enum Rank {
        ACE("Ace", 14),
        TWO("2", 2),
        THREE("3", 3),
        FOUR("4", 4),
        FIVE("5", 5),
        SIX("6", 6),
        SEVEN("7", 7),
        EIGHT("8", 8),
        NINE("9", 9),
        TEN("10", 10),
        JACK("Jack", 11),
        QUEEN("Queen", 12),
        KING("King", 13);

        private final String name;
        private final int value;

        Rank(String name, int value){
            this.name = name;
            this.value = value;
        }

        public String getName(){
            return this.name;
        }

        public int getValue(){
            return this.value;
        }
    }

    public Card(){

    }

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    public String getName() {

        // 4. Complete the getName method.
        // Given a card's suit and rank, getName returns a String in the format:
        // "[rank] of [suit]"

        // Examples:
        // Ace of Clubs
        // 5 of Diamonds
        // King of Hearts
        // 9 of Spades

        // Note: it's unlikely you'll be able to use the enum name directly since enum naming conventions
        // don't match the required output.
        return getRank().getName() + " of " + getSuit().getName();
    }
}
