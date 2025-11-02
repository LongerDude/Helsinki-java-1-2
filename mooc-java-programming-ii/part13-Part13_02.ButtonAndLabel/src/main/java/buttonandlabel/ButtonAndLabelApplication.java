package buttonandlabel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{

    @Override
    public void start(Stage window){
        //create components
        Button button = new Button("Click me");
        Label text = new Label("random text");
        TextField field = new TextField();
        //create the UI layout
        FlowPane componentGroup = new FlowPane();
        //add components to scene
        componentGroup.getChildren().add(text);
        componentGroup.getChildren().add(button);
       
        
        
        //create the scene assign it the layout
        Scene view = new Scene(componentGroup);
        //assign the scene to the stage and render it
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
