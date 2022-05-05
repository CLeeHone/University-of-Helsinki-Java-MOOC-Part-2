package application;
 
import static javafx.application.Application.launch;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import java.text.DecimalFormat;
 
public class SavingsCalculatorApplication extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
 
        VBox vBox = new VBox(100);
        BorderPane layout = new BorderPane();
        BorderPane monthlySavings = new BorderPane();
        BorderPane interest = new BorderPane();
        Label savings = new Label("Monthly savings");
        Label yearlyInt = new Label("Yearly interest rate");
        Label savingsText = new Label("25");
        Label interestText = new Label("0");
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart lineChart = new LineChart(xAxis, yAxis);
        Slider savingsSlider = new Slider(25, 250, 25);
        Slider interestSlider = new Slider(0, 10, 0);
 
        //label the axis
        xAxis.setLabel("Years");
        yAxis.setLabel("Savings");
 
        //configure sliders        
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setPadding(new Insets(10));
 
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setPadding(new Insets(10));
 
        //configure labels
        savings.setPadding(new Insets(10));
        savingsText.setPadding(new Insets(10));
        yearlyInt.setPadding(new Insets(10));
        interestText.setPadding(new Insets(10));
 
        //configure labels to change with slider movement
        savingsSlider.valueProperty().addListener((change, oldValue, newValue)
                -> savingsText.setText((new DecimalFormat("##.##").format(savingsSlider.getValue())))
        );
        interestSlider.valueProperty().addListener((change, oldValue, newValue)
                -> interestText.setText((new DecimalFormat("##.##").format(interestSlider.getValue())))
        );
 
        //configure borderpanes that will go inside the VBox
        monthlySavings.setLeft(savings);
        monthlySavings.setCenter(savingsSlider);
        monthlySavings.setRight(savingsText);
        
        interest.setLeft(yearlyInt);
        interest.setCenter(interestSlider);
        interest.setRight(interestText);
 
        //configure linechart
        lineChart.setTitle("Savings calculator");
 
        //Add data
        XYChart.Series savingsData = new XYChart.Series();
        XYChart.Series interestData = new XYChart.Series();
 
        lineChart.getData().add(savingsData);
        lineChart.getData().add(interestData);
        lineChart.setLegendVisible(false);
        
        //data points change on mouse release of the sliders
        savingsSlider.setOnMouseReleased(event -> {
            updateChart(savingsSlider.getValue(), interestSlider.getValue(), savingsData, interestData);
        });
 
        interestSlider.setOnMouseReleased(event -> {
            updateChart(savingsSlider.getValue(), interestSlider.getValue(), savingsData, interestData);
        });
 
        //configure the VBox
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(40));
        vBox.getChildren().addAll(monthlySavings, interest);
 
        layout.setTop(vBox);
        layout.setCenter(lineChart);
 
        Scene scene = new Scene(layout, 700, 600);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SavingsCalculatorApplication.class);
    }
 
    private void updateChart(double monthlySavings, double interest, XYChart.Series savingsData, XYChart.Series interestData) {
        double pastSavingsAndInterest = 0;
 
        savingsData.getData().clear();
        interestData.getData().clear();
 
        savingsData.getData().add(new XYChart.Data(0, 0));
        interestData.getData().add(new XYChart.Data(0, 0));
 
        for (int i = 1; i <= 30; ++i) {
            savingsData.getData().add(new XYChart.Data(i, i * 12 * monthlySavings));
 
            pastSavingsAndInterest += monthlySavings * 12;
            pastSavingsAndInterest *= (1 + interest / 100.0);
 
            interestData.getData().add(new XYChart.Data(i, pastSavingsAndInterest));
        }
    }
}
 