package textstatistics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    @Override
    public void start(Stage window){
        TextArea field = new TextArea();        
        HBox trackers = new HBox();
        BorderPane layout = new BorderPane();
        trackers.getChildren().add(new Label("Letters: 0"));
        trackers.getChildren().add(new Label("Words: 0"));
        trackers.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(trackers);
        layout.setCenter(field);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
        
        
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
