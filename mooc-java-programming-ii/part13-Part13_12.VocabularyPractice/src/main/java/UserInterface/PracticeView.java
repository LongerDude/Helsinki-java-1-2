/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import application.Dictionary;

/**
 *
 * @author salma
 */
public class PracticeView {

    private Dictionary dict;
    private String word;

    public PracticeView(Dictionary dict) {
        this.dict = dict;
        this.word = this.dict.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();
        Label instructionText = new Label("Translate the word " + this.word);
        Label feedback = new Label("");
        TextField field = new TextField();
        Button button = new Button("Check");
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(instructionText, 0, 0);
        layout.add(field, 0, 1);
        layout.add(button, 0, 2);
        layout.add(feedback, 0, 3);

        button.setOnMouseClicked((event) -> {
            String translation = field.getText();
            if (translation.toLowerCase().equals(dict.get(word))) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! the translation of the word " + word + " is " + this.dict.get(word) + ".");
            }
            this.word = dict.getRandomWord();
            instructionText.setText("Translate the word " + this.word);
            field.clear();

        });
        return layout;
    }

}
