/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

/**
 *
 * @author salma
 */
public class Game {

    private int turn;
    private StringProperty currentPlayer;
    private String player;
    private ArrayList<Button> buttons;
    private boolean gameOver;
    private String winner;

    public Game() {
        buttons = new ArrayList<>();
        turn = 1;
        player = "X";
        currentPlayer = new SimpleStringProperty("Turn: X");
        gameOver = false;
        this.winner = "tie";
    }

    public void add(Button button) {
        this.buttons.add(button);
    }

    public StringProperty getPlayer() {
        return this.currentPlayer;
    }

    public void turnLogic() {

        if (turn % 2 == 0) {
            player = "O";

            currentPlayer.set("Turn: O");
        } else {
            player = "X";
            currentPlayer.set("Turn: X");
        }
    }

    public void winLogic() {
        int sum = 0;
        for (int i = 0; i < 9; i += 3) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player X";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            winner = "Player O";
            this.gameOver = true;
        }
        sum = 0; // resets
        for (int i = 1; i < 9; i += 3) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player X";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            this.gameOver = true;
            winner = "Player O";
        }
        sum = 0; // resets
        for (int i = 2; i < 9; i += 3) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player X";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            this.gameOver = true;
            winner = "Player O";
        }
        sum = 0; // resets
        for (int i = 0; i < 3; i++) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player X";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            this.gameOver = true;
            winner = "Player O";
        }
        sum = 0; // resets
        for (int i = 3; i < 6; i++) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player X";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            this.gameOver = true;
            winner = "Player O";
        }
        sum = 0; // resets
        for (int i = 6; i < 9; i++) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player X";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            this.gameOver = true;
            winner = "Player O";
        }
        sum = 0; // resets
        for (int i = 0; i < 9; i += 4) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player O";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            this.gameOver = true;
            winner = "Player O";
        }
        sum = 0; // resets
        for (int i = 2; i < 9; i += 2) {
            if (buttons.get(i).getText().contains("X")) {

                sum += (int) 'X';

            }
            if (buttons.get(i).getText().contains("O")) {

                sum += (int) 'O';
            }
        }
        if (sum == (int) 'X' * 3) {
            //X wins
            this.gameOver = true;
            winner = "Player X";
        } else if (sum == (int) 'O' * 3) {

            //O wins
            this.gameOver = true;
            winner = "Player O";
        }
        sum = 0; // resets

    }

    public void handleButtonClick(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();
        clickedButton.setText(this.player);
        clickedButton.setDisable(true);
        this.turn++;
        this.turnLogic();
        this.winLogic();
        if (this.gameOver == true) {
            currentPlayer.set("The end!");
            for (Button button : buttons) {
                button.setDisable(true);
            }
        }
        if (turn > 9) {
            currentPlayer.set("The end!");
            for (Button button : buttons) {
                button.setDisable(true);
            }
        }

    }

    public void reset() {
        clear();
        turn = 1;
        player = "X";
        currentPlayer.set(winner + " wins!");
        gameOver = false;
        this.winner = "tie";

    }

    public void clear() {
        for (Button buttn : buttons) {
            buttn.setText(" ");
            buttn.setDisable(false);
        }

    }

}
