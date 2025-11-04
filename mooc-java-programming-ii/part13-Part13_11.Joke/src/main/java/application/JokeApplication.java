package application;

import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {
        //Components
        Button firstButton = new Button("Joke");
        Button secondButton = new Button("Answer");
        Button thirdButton = new Button("Explanation");

        //Layouts
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        menu.getChildren().addAll(firstButton, secondButton, thirdButton);
        BorderPane mainLayout = new BorderPane();
        
        mainLayout.setTop(menu);
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("Because all the bear has is gums, which plans on the candy called gummy bear.");
        mainLayout.setCenter(firstLayout);
        
        firstButton.setOnAction((event) -> {mainLayout.setCenter(firstLayout);});
        secondButton.setOnAction((event) -> {mainLayout.setCenter(secondLayout);});
        thirdButton.setOnAction((event) -> {mainLayout.setCenter(thirdLayout);});
        
        //Scenes
        Scene scene = new Scene(mainLayout);
        window.setScene(scene);
        window.show();
        
    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
