package buttonandtextfield;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage window) {
        Button button = new Button("Click me");
        TextField field = new TextField();
        
        FlowPane layout = new FlowPane();
        layout.getChildren().add(button);
        layout.getChildren().add(field);
        
        Scene scene = new Scene(layout);
        
        window.setTitle("Hi there");
        window.setScene(scene);
        window.show();
        

    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
