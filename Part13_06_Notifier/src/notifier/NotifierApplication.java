package notifier;
 
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class NotifierApplication extends Application {
 
    @Override
    public void start(Stage window) {
        TextField text = new TextField();
        Button button = new Button();
        Label label = new Label();
        VBox box = new VBox();
 
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
 
        box.setSpacing(10);
        box.getChildren().addAll(text, button, label);
 
        Scene scene = new Scene(box);
 
        window.setScene(scene);
        window.show();
    }
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
 
}