/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;
 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
 
/**
 *
 * @author chloe
 */
public class GameFunctionality {
 
    String player = "O";
    Label turn = new Label("Turn: " + player);
 
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
 
    public GameFunctionality(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9, Button resetButton, Label turn) {
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
        this.button5 = button5;
        this.button6 = button6;
        this.button7 = button7;
        this.button8 = button8;
        this.button9 = button9;
        this.resetButton = resetButton;
        this.turn = turn;
    }
 
    private void checkWin(Button button) {
        if (!button1.getText().contains(" ") && !button2.getText().contains(" ") && !button3.getText().contains(" ") && !button4.getText().contains(" ") && !button5.getText().contains(" ") && !button6.getText().contains(" ") && 
            !button7.getText().contains(" ") && !button8.getText().contains(" ") && !button9.getText().contains(" ")) {
            turn.setText("The end!");
    }
            
        if (compare(button1, button2, button3)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button4, button5, button6)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button7, button8, button9)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button1, button4, button7)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button2, button5, button8)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button3, button6, button9)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button3, button5, button7)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button1, button5, button9)) {
             turn.setText("The end!");
            lockButtons();
        } else if (compare(button3, button5, button7)) {
             turn.setText("The end!");
            lockButtons();
        }
    }
 
    public boolean compare(Button comparison1, Button comparison2, Button comparison3) {
        if (!comparison1.getText().equals(" ") && !comparison2.getText().equals(" ") && !comparison3.getText().equals(" ")) {
            if (comparison1.getText().contentEquals(comparison2.getText()) && comparison2.getText().contentEquals(comparison3.getText())) {
                return true;
            }
        }
        return false;
    }
 
    public void lockButtons() {
        button1.setDisable(true);
        button2.setDisable(true);
        button3.setDisable(true);
        button4.setDisable(true);
        button5.setDisable(true);
        button6.setDisable(true);
        button7.setDisable(true);
        button8.setDisable(true);
        button9.setDisable(true);
    }
 
    public void switchPlayer(Button button) {
        if (button.getText().contentEquals(" ")) {
            turn.setText("Turn: " + player);
            player = player.equals("X") ? "O" : "X";
            button.setText(player);
            checkWin(button);
        }
    }
 
    public void resetGame() {
        button1.setDisable(false);
        button2.setDisable(false);
        button3.setDisable(false);
        button4.setDisable(false);
        button5.setDisable(false);
        button6.setDisable(false);
        button7.setDisable(false);
        button8.setDisable(false);
        button9.setDisable(false);        
        
        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
        
        player = "O";
        
        turn.setText("Turn: " + player);
    }
 
}