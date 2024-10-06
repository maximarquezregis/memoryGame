package com.memoryGame;

/**
 * Represents a card for a memory game.
 *
 * @author maximaquezregis
 **/
public class Card {
    private final int id;
    private boolean faceUp;

    /**
     * Constructs a Card with the specified id.
     * @param id id of the card
     */
    public Card(int id) {
        this.id = id;
        this.faceUp = false;
    }

    /**
     * Getter for the id of the card
     * @return id of the card
     */
    public int getId() {
        return id;
    }

    /**
     * Tells if the card is facing up or not
     * @return true iff the card is facing up, false otherwise
     */
    public boolean isFaceUp() {
        return faceUp;
    }

    /**
     * Flips the card
     */
    public void flip() {
        faceUp = !faceUp;
    }
}
