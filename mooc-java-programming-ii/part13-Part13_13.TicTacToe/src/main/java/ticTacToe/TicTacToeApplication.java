package ticTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import ticTacToe.Game;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage window) {
        Game gameLogic = new Game();
        var buttons = new ArrayList<Button>();
        BorderPane layout = new BorderPane();
        Label turn = new Label("Turn: X");
        turn.textProperty().bind(gameLogic.getPlayer());

        GridPane game = new GridPane();
        int trackerx = 0;
        int trackery = 0;

        for (int i = 0; i < 9; i++) {
            Button btn = new Button(" ");
            btn.setFont(Font.font("Monospaced", 40));

            btn.setOnAction((event) -> {

                gameLogic.handleButtonClick(event);

            });

            if (trackery == 3) {
                trackery = 0;
                trackerx++;
            }
            game.add(btn, trackerx, trackery);
            trackery++;
            gameLogic.add(btn);

        }

        layout.setTop(turn);
        layout.setCenter(game);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
