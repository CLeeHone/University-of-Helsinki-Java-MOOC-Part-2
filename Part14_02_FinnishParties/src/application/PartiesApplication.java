package application;
 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Paths;
 
public class PartiesApplication extends Application {
 
    private HashMap<String, Map<Integer, Double>> partyValues = new HashMap<>();
 
    public PartiesApplication() {
        this.partyValues = readPartyData("partiesdata.tsv");
    }
 
    @Override
    public void start(Stage stage) {
 
        NumberAxis xAxis = new NumberAxis(1966, 2010, 2);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
 
        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("Relative support for the parties");
 
        partyValues.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
 
            partyValues.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            lineChart.getData().add(data);
        });
 
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
 
    private HashMap<String, Map<Integer, Double>> readPartyData(String file) {
        HashMap<String, Map<Integer, Double>> values = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();
 
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            String yearValues = scanner.nextLine();
            String[] yearPieces = yearValues.split("\t");
            for (int i = 1; i < yearPieces.length; ++i) {
                years.add(Integer.valueOf(yearPieces[i]));
            }
 
            while (scanner.hasNext()) {
                String dataLine = scanner.nextLine();
                String[] parts = dataLine.split("\t");
                String politicalParty = parts[0];
                Map<Integer, Double> yearAndData = new HashMap<>();
 
                for (int i = 1; i < parts.length; ++i) {
                    if (!parts[i].equals("-")) {
                        int year = years.get(i - 1);
                        double dataPoint = Double.valueOf(parts[i]);
                        yearAndData.put(year, dataPoint);
                    }
                }
                values.put(politicalParty, yearAndData);
            }
 
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return values;
    }
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }
 
}