package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                red = 1- red;
                double green = color.getGreen();
                green = 1-green;
                double blue = color.getBlue();
                blue =  1 - blue;
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }

        ImageView image = new ImageView(targetImage);

        int width1 = (int) sourceImage.getWidth() / 2;
        int height1 = (int) sourceImage.getHeight() / 2;

        WritableImage targetImage1 = new WritableImage(width1, height1);
        PixelWriter imageWriter1 = targetImage1.getPixelWriter();

        for (int y = 0; y < height1; y++) {
            for (int x = 0; x < width1; x++) {

                Color pixelColor = imageReader.getColor(x * 2, y * 2);
                double red = pixelColor.getRed();
                red = 1 - red;
                double green = pixelColor.getGreen();
                green = 1 - green;
                double blue = pixelColor.getBlue();
                blue = 1 - blue;
                double opacity = pixelColor.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter1.setColor(x, y, newColor);
            }
        }
        ImageView image1 = new ImageView(targetImage1);

        int width2 = (int) sourceImage.getWidth() / 2;
        int height2 = (int) sourceImage.getHeight() / 2;

        WritableImage targetImage2 = new WritableImage(width2, height2);
        PixelWriter imageWriter2 = targetImage2.getPixelWriter();

        for (int y = 0; y < height1; y++) {
            for (int x = 0; x < width1; x++) {

                Color pixelColor = imageReader.getColor(x * 2, y * 2);
                double red = pixelColor.getRed();
                red = 1 - red;
                double green = pixelColor.getGreen();
                green = 1 - green;
                double blue = pixelColor.getBlue();
                blue = 1 - blue;
                double opacity = pixelColor.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter2.setColor(x, y, newColor);
            }
        }
        ImageView image2 = new ImageView(targetImage2);

        int width3 = (int) sourceImage.getWidth() / 2;
        int height3 = (int) sourceImage.getHeight() / 2;

        WritableImage targetImage3 = new WritableImage(width2, height2);
        PixelWriter imageWriter3 = targetImage3.getPixelWriter();

        for (int y = 0; y < height1; y++) {
            for (int x = 0; x < width1; x++) {

                Color pixelColor = imageReader.getColor(x * 2, y * 2);
                double red = pixelColor.getRed();
                red = 1 - red;
                double green = pixelColor.getGreen();
                green = 1 - green;
                double blue = pixelColor.getBlue();
                blue = 1 - blue;
                double opacity = pixelColor.getOpacity();

                Color newColor = new Color(red,  green, blue, opacity);

                imageWriter3.setColor(x, y, newColor);
            }
        }
        ImageView image3 = new ImageView(targetImage3);
        
        WritableImage targetImage4 = new WritableImage(width2, height2);
        PixelWriter imageWriter4 = targetImage4.getPixelWriter();

        for (int y = 0; y < height1; y++) {
            for (int x = 0; x < width1; x++) {

                Color pixelColor = imageReader.getColor(x * 2, y * 2);
                double red = pixelColor.getRed();
                red = 1 - red;
                double green = pixelColor.getGreen();
                green = 1 - green;
                double blue = pixelColor.getBlue();
                blue = 1 - blue;
                double opacity = pixelColor.getOpacity();
                Color newColor = new Color(red, green, blue, opacity);

                imageWriter4.setColor(x, y, newColor);
            }
        }
        ImageView image4 = new ImageView(targetImage4);

        GridPane grid = new GridPane();
        grid.add(image1, 0, 0);
        grid.add(image2, 0, width2);
        grid.add(image3, height2, 0);
        grid.add(image4, height2, width2);
        Pane pane = new Pane();
        
        pane.getChildren().add(grid);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
