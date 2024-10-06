package com.memoryGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a memory game.
 */
public class Game {
    private final Board board;
    private final List<Card> cards;
    private int remainingPairs;

    /**
     * Constructs a Game with the specified number of rows and columns.
     * @param rows amount of rows
     * @param columns amount of columns
     */
    public Game(int rows, int columns) {
        this.board = new Board(rows, columns);
        this.cards = new ArrayList<>(rows * columns);
        for (int i = 0; i < rows * columns; i++) {
            cards.add(new Card(i));
        }
        this.remainingPairs = rows * columns / 2;
    }

    /**
     * Starts the game randomly inserting cards into the board.
     */
    public void startGame() {
        List<Integer> cardIds = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            cardIds.add(i);
        }
        Collections.shuffle(cardIds);
        for (int i = 0; i < cards.size(); i++) {
            cards.set(i, new Card(cardIds.get(i)));
        }
        int k = 0;
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                board.setCard(i, j, cards.get(k));
                k++;
            }
        }
        remainingPairs = cardIds.size() / 2;
    }

    /**
     * Gets the board of the game.
     * @return the actual state of the board
     */
    public Board getBoard() {
        return board;
    }
}