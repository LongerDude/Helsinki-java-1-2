package notifier;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NotifierApplication extends Application{

    @Override
    public void start(Stage window){
        Button button = new Button("Update");
        Label label = new Label("");
        TextField field = new TextField();
        
        button.setOnAction((event) -> {
           label.setText(field.getText());
        });
        
        VBox layout = new VBox();
        
        layout.getChildren().addAll(field,button,label);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
        
        
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
        
    }

}
