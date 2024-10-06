package com.memoryGame;
import javafx.scene.control.Button;

/**
 * Represents a card view for a memory game.
 */
public class CardView extends Button {
    private final Card card;

    /**
     * Constructs a CardView with the specified card.
     * @param card card to be represented
     */
    public CardView(Card card) {
        this.card = card;
        setText("?");
        setMinSize(100, 100);
        setOnAction(e -> flipCard());
    }

    /**
     * Flips the card.
     */
    private void flipCard() {
        card.flip();
        if (card.isFaceUp()) {
            setText(String.valueOf(card.getId()));
        } else {
            setText("?");
        }
    }
}