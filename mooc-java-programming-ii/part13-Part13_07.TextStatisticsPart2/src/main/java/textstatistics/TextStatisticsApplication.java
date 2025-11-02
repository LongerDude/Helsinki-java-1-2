package textstatistics;

import java.util.Arrays;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        TextArea text = new TextArea();
        HBox bottom = new HBox();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");

        text.textProperty().addListener((change, oldValue, newValue) -> {
            int chars = newValue.length();
            letters.setText("Letters: " + chars);
            String[] parts = newValue.split(" ");
            if (parts.length == 0) {
                words.setText("Words: " + (parts.length - 1));
            } else {
                words.setText("Words: " + parts.length);
            }

            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            longestWord.setText("The longest word is: " + longest);
        });

        bottom.getChildren().addAll(letters, words, longestWord);
        bottom.setSpacing(20);

        BorderPane border = new BorderPane();
        border.setCenter(text);
        border.setBottom(bottom);

        Scene scene = new Scene(border);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
