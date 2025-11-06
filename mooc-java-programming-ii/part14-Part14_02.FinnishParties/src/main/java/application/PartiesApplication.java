package application;

import java.nio.file.Paths;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.util.Scanner;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1968,2008,4);
        NumberAxis yAxis = new NumberAxis(0,40,10);
        xAxis.setLabel("Year");
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        parseData("partiesdata.tsv",lineChart);
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public void parseData(String file, LineChart<Number, Number> linechart) {
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) { //file scanner
            String header = fileScanner.nextLine(); //store the header and then skip it
            String[] headerParts = header.split("\t"); //breaking down the header

            while (fileScanner.hasNextLine()) { //iterate over each row and add it to the line chart
                XYChart.Series data = new XYChart.Series(); //create a graph
                String row = fileScanner.nextLine(); //store the current row
                String[] parts = row.split("\t"); // break it down
                data.setName(parts[0]); // set name for the current graph
                for (int i = 1; i < parts.length; i++) {  // add the data
                    System.out.println(headerParts[i]);
                    System.out.println(parts[i]);
                    if (parts[i].equals("-")){
                        continue;
                    }
                    data.getData().add(new XYChart.Data(Integer.valueOf(headerParts[i]), Double.valueOf(parts[i])));
                }
                linechart.getData().add(data); // add the completed graph into the chart
            }

        } catch (Exception e) {
            System.out.println(e.getMessage() + "Error: ");

        }
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);

    }

}
