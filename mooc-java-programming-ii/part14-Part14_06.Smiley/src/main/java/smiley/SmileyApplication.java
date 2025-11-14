package smiley;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {
        /*/
        BorderPane GUI = new BorderPane();
        Canvas canva = new Canvas();
        GraphicsContext painter =  canva.getGraphicsContext2D();
        painter.setFill(Color.WHITE);
        painter.fillRect(75,75,100,100);
        GUI.setCenter(canva);
        Scene scene = new Scene(GUI);
        window.setScene(scene);
        window.show();
        /*/
        
        BorderPane root = new BorderPane();
        final Canvas canvas = new Canvas(600,600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(100,50,50,50);
        gc.fillRect(50,200,50,50);
        gc.fillRect(100,250,50,50);
        gc.fillRect(150,250,50,50);
        gc.fillRect(200,250,50,50);
        gc.fillRect(250,250,50,50);
        gc.fillRect(250,50,50,50);
        gc.fillRect(300,200,50,50);
        
        
        
        
        Scene s = new Scene(root,600,600, Color.WHITE);
        root.setCenter(canvas);
        window.setScene(s);
        window.show();

    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);

    }

}
