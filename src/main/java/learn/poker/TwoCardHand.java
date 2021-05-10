package learn.poker;

import learn.cards.Card;

public class TwoCardHand implements Comparable<TwoCardHand> {

    private final Card one;
    private final Card two;

    public TwoCardHand(Card one, Card two) {
        this.one = one;
        this.two = two;
    }

    public Card getOne() {
        return one;
    }

    public Card getTwo() {
        return two;
    }

    @Override
    public int compareTo(TwoCardHand o) {
        // 1. Complete the compareTo method.
        // See Exercise04.md for scoring rules.

        // A pair always beats a non-pair.
        if((this.getOne().getRank() == this.getTwo().getRank()) && !(o.getOne().getRank() == o.getTwo().getRank())){
            return 1;
        }

        //If two hands have pairs, the highest pair wins.
        if((this.getOne().getRank().getValue() == this.getTwo().getRank().getValue())
        && (o.getOne().getRank().getValue() == o.getTwo().getRank().getValue())
        && (Math.max(this.getOne().getRank().getValue(), this.getTwo().getRank().getValue())
        > (Math.max(o.getOne().getRank().getValue(), o.getTwo().getRank().getValue())))) {
            return 1;
        }

        //If two hands have the same pair, it's a tie.
        if(this.getOne().getRank().getValue() == this.getTwo().getRank().getValue()
        && o.getOne().getRank().getValue() == o.getTwo().getRank().getValue()
        && this.getOne().getRank().getValue() == o.getOne().getRank().getValue()){
            return 0;
        }

        //If two hands don't have pairs, the highest card wins.
        if(Math.max(this.getOne().getRank().getValue(), this.getTwo().getRank().getValue())
                > Math.max(o.getOne().getRank().getValue(), o.getTwo().getRank().getValue())){
            return 1;
        }

        //If two hands have the same high card, the highest second card wins
        if(Math.max(this.getOne().getRank().getValue(), this.getTwo().getRank().getValue())
                == Math.max(o.getOne().getRank().getValue(), o.getTwo().getRank().getValue())
        && (Math.min(this.getOne().getRank().getValue(), this.getTwo().getRank().getValue())
                > Math.min(o.getOne().getRank().getValue(), o.getTwo().getRank().getValue()))){
            return 1;
        }

        //If two hands have the same high/low card, it's a tie.
        if(Math.max(this.getOne().getRank().getValue(), this.getTwo().getRank().getValue())
                == Math.max(o.getOne().getRank().getValue(), o.getTwo().getRank().getValue())
                && (Math.min(this.getOne().getRank().getValue(), this.getTwo().getRank().getValue())
                == Math.min(o.getOne().getRank().getValue(), o.getTwo().getRank().getValue()))){
            return 0;
        }

        return -1;
    }
}
