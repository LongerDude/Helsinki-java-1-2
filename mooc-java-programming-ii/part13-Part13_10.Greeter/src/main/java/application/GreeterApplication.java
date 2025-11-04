package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        // components
        Label instructionText = new Label("Enter your name and start.");
        TextField passwordField = new TextField();
        Button startButton = new Button("Start");

        //Layout + adding components
        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(passwordField, 0, 1);
        layout.add(startButton, 0, 2);
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));



        //first scene
        Scene mainView = new Scene(layout);

        //component for second scene
        Label welcomeMessage = new Label("");
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeMessage);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        startButton.setOnAction((Event) -> {
            welcomeMessage.setText("Welcome "+passwordField.getText()+"!");
            window.setScene(welcomeView);
        });
        window.setScene(mainView);
        window.show();

    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
