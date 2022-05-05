package application;
 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class GreeterApplication extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        TextField textField = new TextField();
        Button startButton = new Button("Start");
        Label instructionText = new Label("Enter your name and start.");
 
        GridPane layout = new GridPane();
 
        layout.add(instructionText, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(startButton, 0, 2);
 
        layout.setPrefSize(250, 100);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
 
        Scene nameView = new Scene(layout);
 
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(250, 100);
        welcomeLayout.setAlignment(Pos.CENTER);
 
        Scene welcomeView = new Scene(welcomeLayout);
 
        startButton.setOnAction((event) -> {
            Label welcomeText = new Label("Welcome " + textField.getText() + "!");
            welcomeLayout.getChildren().add(welcomeText);
            stage.setScene(welcomeView);
        });
 
        stage.setScene(nameView);
 
        stage.show();
    }
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(GreeterApplication.class);
    }
}
 