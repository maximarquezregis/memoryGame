package com.memoryGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Represents the main class of the application.
 */
public class Main extends Application {

    /**
     * Starts the application.
     * @param primaryStage the primary stage of the application
     */
    @Override
    public void start(Stage primaryStage) {
        Game game = new Game(4, 4); // Example with a 4x4 board
        game.startGame();

        // Creates a GridPane to display the cards
        GridPane gridPane = new GridPane();
        Board board = game.getBoard();

        // Adds the cards to the GridPane
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                Card card = board.getCard(i, j);
                CardView cardView = new CardView(card);
                gridPane.add(cardView, j, i);
            }
        }

        // Creates the Scene and sets it to the Stage
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Memory Game");
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launches the application
        launch(args);
    }
}