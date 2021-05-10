package learn.poker;

import learn.cards.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCardHandTest {

    // 1. Instantiate hands with the appropriate suit and rank for each test.
    // 2. Run the tests and confirm they pass. Do NOT edit existing tests.
    // 3. Add a couple more tests to confirm everything is working as intended.

    @Test
    void twoQueensShouldBeatTwo10s() {
        TwoCardHand queenQueen = new TwoCardHand(new Card(Card.Rank.QUEEN, Card.Suit.SPADES), new Card(Card.Rank.QUEEN, Card.Suit.HEARTS));
        TwoCardHand tenTen = new TwoCardHand(new Card(Card.Rank.TEN, Card.Suit.HEARTS), new Card(Card.Rank.TEN, Card.Suit.SPADES));
        assertTrue(queenQueen.compareTo(tenTen) > 0);
    }

    @Test
    void two9sShouldBeatJack10() {
        TwoCardHand nineNine = new TwoCardHand(new Card(Card.Rank.NINE, Card.Suit.SPADES), new Card(Card.Rank.NINE, Card.Suit.CLUBS));
        TwoCardHand jackTen = new TwoCardHand(new Card(Card.Rank.JACK, Card.Suit.HEARTS), new Card(Card.Rank.TEN, Card.Suit.DIAMONDS));
        assertTrue(nineNine.compareTo(jackTen) > 0);
    }

    @Test
    void queen4ShouldBeatJack10() {
        TwoCardHand queenFour = new TwoCardHand(new Card(Card.Rank.QUEEN, Card.Suit.HEARTS), new Card(Card.Rank.FOUR, Card.Suit.CLUBS));
        TwoCardHand jackTen = new TwoCardHand(new Card(Card.Rank.JACK, Card.Suit.DIAMONDS), new Card(Card.Rank.TEN, Card.Suit.SPADES));
        assertTrue(queenFour.compareTo(jackTen) > 0);
    }

    @Test
    void queen5ShouldBeatQueen3() {
        TwoCardHand queenFive = new TwoCardHand(new Card(Card.Rank.QUEEN, Card.Suit.HEARTS), new Card(Card.Rank.FIVE, Card.Suit.CLUBS));
        TwoCardHand queenThree = new TwoCardHand(new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS), new Card(Card.Rank.THREE, Card.Suit.SPADES));
        assertTrue(queenFive.compareTo(queenThree) > 0);
    }

    @Test
    void two5sShouldTieTwo5s() {
        TwoCardHand firstFiveFive = new TwoCardHand(new Card(Card.Rank.FIVE, Card.Suit.HEARTS), new Card(Card.Rank.FIVE, Card.Suit.CLUBS));
        TwoCardHand secondFiveFive = new TwoCardHand(new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS), new Card(Card.Rank.FIVE, Card.Suit.SPADES));
        assertEquals(0, firstFiveFive.compareTo(secondFiveFive));
    }

    @Test
    void jack4ShouldTieJack4() {
        // TODO: instantiate Cards and TwoCardHands with appropriate arguments
        TwoCardHand firstJackFour = new TwoCardHand(new Card(Card.Rank.JACK, Card.Suit.HEARTS), new Card(Card.Rank.FOUR, Card.Suit.HEARTS));
        TwoCardHand secondJackFour = new TwoCardHand(new Card(Card.Rank.JACK, Card.Suit.HEARTS), new Card(Card.Rank.FOUR, Card.Suit.CLUBS));
        assertEquals(0, firstJackFour.compareTo(secondJackFour));
    }

}