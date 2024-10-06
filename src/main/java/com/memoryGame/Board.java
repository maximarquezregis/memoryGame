package com.memoryGame;

/**
 * Represents a board for a memory game.
 *
 * @author maximaquezregis
 **/
public class Board {
    private final int rows;
    private final int columns;
    private final Card[][] cards;

    /**
     * Constructs a Board with the specified number of rows and columns.
     * @param rows amount of rows
     * @param columns amount of columns
     */
    public Board(int rows, int columns) {
        if (rows <= 2 || columns <= 2) {
            throw new IllegalArgumentException("The board must have at least 3 rows and 3 columns");
        }
        // if (columns * rows) is odd, the board can't have an even number of cards
        if ((rows * columns) % 2 != 0) {
            throw new IllegalArgumentException("The board should be able to have an even number of cards");
        }
        this.rows = rows;
        this.columns = columns;
        this.cards = new Card[rows][columns];
    }

    /**
     * Sets a card at the specified row and column.
     * @param row row in which the card will be set
     * @param column column in which the card will be set
     * @param card card to be set
     */
    public void setCard(int row, int column, Card card) {
        if (cards[row][column] != null) {
            throw new IllegalArgumentException("There is already a card at row " + row + " and column " + column);
        }
        cards[row][column] = card;
    }

    /**
     * Retrieves a card from the given position in the Board
     * @param row row from which the card will be retrieved
     * @param column column from which the card will be retrieved
     * @return the card at the given position
     */
    public Card getCard(int row, int column) {
        if (cards[row][column] == null) {
            throw new IllegalArgumentException("No card at row " + row + " and column " + column);
        }
        return cards[row][column];
    }

    /**
     * Getter for amount of Rows
     * @return amount of rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * Getter for amount of Columns
     * @return amount of columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Checks if the board is full
     * @return true if the board is full, false otherwise
     */
    public boolean isFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns ; j++) {
                if (cards[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
