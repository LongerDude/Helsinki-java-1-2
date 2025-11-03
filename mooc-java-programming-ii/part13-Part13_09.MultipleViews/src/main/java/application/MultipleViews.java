package application;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javafx.scene.layout.GridPane;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        //layouts
        BorderPane firstLayout = new BorderPane();
        VBox secondLayout = new VBox();
        GridPane thirdLayout = new GridPane();

        //Components
        Label viewer = new Label("First view!");
        Button button1 = new Button("To the second view!");
        Button button2 = new Button("To the third view!");
        Button button3 = new Button("To the first view!");

        firstLayout.setTop(viewer);
        firstLayout.setCenter(button1);

        secondLayout.getChildren().addAll(button2, new Label("Second view!"));

        thirdLayout.add(new Label("Third view!"), 0, 0);
        thirdLayout.add(button3, 1, 1);
        

        // scenes
        Scene firstView = new Scene(firstLayout);
        Scene secondView = new Scene(secondLayout);
        Scene thirdView = new Scene(thirdLayout);
        window.setScene(firstView);
        button1.setOnAction((event) -> {
            window.setScene(secondView);
        });
        button2.setOnAction((event) -> {
            window.setScene(thirdView);
        });
        button3.setOnAction((event) -> {
            window.setScene(firstView);
        });
        window.show();

    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
