/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chloe
 */
package ticTacToe;
 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class UI extends Application {
 
    String player = "X";
    Button button1 = new Button(" ");
    Button button2 = new Button(" ");
    Button button3 = new Button(" ");
    Button button4 = new Button(" ");
    Button button5 = new Button(" ");
    Button button6 = new Button(" ");
    Button button7 = new Button(" ");
    Button button8 = new Button(" ");
    Button button9 = new Button(" ");
    Button resetButton = new Button("Reset");
    Label turn = new Label("Turn: " + player);
 
    GameFunctionality game = new GameFunctionality(button1, button2, button3, button4, button5, button6, button7, button8, button9, resetButton, turn);
 
    BorderPane layout = new BorderPane();
    GridPane gameBoard = new GridPane();
 
    @Override
    public void start(Stage stage) throws Exception {
 
        button1.setFont(Font.font("Monospaced", 40));
        button2.setFont(Font.font("Monospaced", 40));
        button3.setFont(Font.font("Monospaced", 40));
        button4.setFont(Font.font("Monospaced", 40));
        button5.setFont(Font.font("Monospaced", 40));
        button6.setFont(Font.font("Monospaced", 40));
        button7.setFont(Font.font("Monospaced", 40));
        button8.setFont(Font.font("Monospaced", 40));
        button9.setFont(Font.font("Monospaced", 40));
        resetButton.setFont(Font.font("Monospaced", 40));
        turn.setFont(new Font("Monospaced", 40));
 
        //set text "Turn" at the top of the screen
        layout.setTop(turn);
        layout.setBottom(resetButton);
 
        //create the game board and set position in layout
        gameBoard.add(button1, 0, 1);
        gameBoard.add(button2, 1, 1);
        gameBoard.add(button3, 2, 1);
        gameBoard.add(button4, 0, 2);
        gameBoard.add(button5, 1, 2);
        gameBoard.add(button6, 2, 2);
        gameBoard.add(button7, 0, 3);
        gameBoard.add(button8, 1, 3);
        gameBoard.add(button9, 2, 3);
 
        layout.setCenter(gameBoard);
        layout.setPadding(new Insets(10, 10, 10, 10));
 
        //set functionality to buttons
        button1.setOnAction((event) -> game.switchPlayer(button1));
        button2.setOnAction((event) -> game.switchPlayer(button2));
        button3.setOnAction((event) -> game.switchPlayer(button3));
        button4.setOnAction((event) -> game.switchPlayer(button4));
        button5.setOnAction((event) -> game.switchPlayer(button5));
        button6.setOnAction((event) -> game.switchPlayer(button6));
        button7.setOnAction((event) -> game.switchPlayer(button7));
        button8.setOnAction((event) -> game.switchPlayer(button8));
        button9.setOnAction((event) -> game.switchPlayer(button9));
        resetButton.setOnAction((event) -> game.resetGame());
        
        Scene scene = new Scene(layout, 260, 400);
 
        stage.setScene(scene);
        stage.show();
    }
}