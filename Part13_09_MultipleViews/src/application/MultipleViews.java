package application;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class MultipleViews extends Application {
 
    @Override
    public void start(Stage stage) {
 
        BorderPane firstLayout = new BorderPane();
        Button toSecond = new Button("To the second view!");
        firstLayout.setTop(new Label("First view!"));
        firstLayout.setCenter(toSecond);
        Scene first = new Scene(firstLayout);
 
        VBox secondLayout = new VBox();
        Button toThird = new Button("To the third view!");
        secondLayout.getChildren().add(toThird);
        secondLayout.getChildren().add(new Label("To the third view!"));
        Scene second = new Scene(secondLayout);
 
        GridPane thirdLayout = new GridPane();
        Button toFirst = new Button("To the first view!");
        Label thirdLabel = new Label("To the first view!");
        thirdLayout.add(thirdLabel, 1, 1);
        thirdLayout.add(toFirst, 1, 2);
        Scene third = new Scene(thirdLayout);
 
        toSecond.setOnAction((event) -> {
            stage.setScene(second);
        });
 
        toThird.setOnAction((event) -> {
            stage.setScene(third);
        });
 
        toFirst.setOnAction((event) -> {
            stage.setScene(first);
        });
 
        stage.setScene(first);
        stage.show();
 
    }
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }
 
}