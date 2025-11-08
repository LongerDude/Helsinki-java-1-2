package application;
//Libraries

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage window) {
        //Main layout
        BorderPane layout = new BorderPane();
        //upper layout
        VBox sliders = new VBox();
        //slider components
        BorderPane firstSliderLayout = new BorderPane();
        BorderPane secondSliderLayout = new BorderPane();

        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setBlockIncrement(0.25f);
        savingsSlider.setValue(25);
        savingsSlider.snapToTicksProperty();
        savingsSlider.setSnapToTicks(true);

        Label textFirst = new Label("Monthly savings");
        Label firstValue = new Label("0");
        savingsSlider.valueProperty().addListener((observable, old, newv) -> {
            firstValue.setText("" + newv.doubleValue());

        });

        Slider interestSlider = new Slider(0, 10, 1);
        interestSlider.setShowTickLabels(true);
        interestSlider.setValue(0);
        interestSlider.snapToTicksProperty();
        interestSlider.setSnapToTicks(true);
        Label secondValue = new Label("0");
        Label textSecond = new Label("Yearly interest rate");
        interestSlider.valueProperty().addListener((observable, old, newv) -> {
            secondValue.setText("" + newv.doubleValue());

        });

        //settings
        firstSliderLayout.setLeft(textFirst);
        firstSliderLayout.setCenter(savingsSlider);
        firstSliderLayout.setRight(firstValue);

        secondSliderLayout.setLeft(textSecond);
        secondSliderLayout.setCenter(interestSlider);
        secondSliderLayout.setRight(secondValue);

        Double v = savingsSlider.getValue();

        sliders.getChildren().addAll(firstSliderLayout, secondSliderLayout);
        layout.setTop(sliders);
        //center layout
        NumberAxis xAxis = new NumberAxis(0, 30, 1); // axis
        NumberAxis yAxis = new NumberAxis();// y axis
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis); // chart body
        XYChart.Series dataSavingsNoInterest = new XYChart.Series(); //graph

        savingsSlider.valueProperty().addListener((observable, old, newv) -> {
            dataSavingsNoInterest.getData().clear();

            for (int i = 0; i < 31; i++) {
                dataSavingsNoInterest.getData().add(new XYChart.Data(i, (int) newv.doubleValue() * i * 12));
            }

        });

        XYChart.Series dataSavingsInterest = new XYChart.Series(); //graph
        savingsSlider.valueProperty().addListener((observable, old, newv) -> {
            dataSavingsInterest.getData().clear();
            dataSavingsInterest.getData().add(new XYChart.Data(0, 0));
            double result = savingsSlider.getValue() * 12;
            dataSavingsInterest.getData().add(new XYChart.Data(1, result));

            for (int i = 2; i < 31; i++) {

                result = result + (savingsSlider.getValue() * 12) + (result * (interestSlider.getValue() / 100));

                dataSavingsInterest.getData().add(new XYChart.Data(i, result));
            }

        });
        dataSavingsInterest.setName("");

        lineChart.getData().add(dataSavingsNoInterest); // add the graphData to the chart 
        lineChart.getData().add(dataSavingsInterest); // add the graphData to the chart 
        layout.setCenter(lineChart); // chart set to center of gui

        Scene scene = new Scene(layout, 640, 480);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
