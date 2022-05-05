package textstatistics;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class TextStatisticsApplication extends Application {
 
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label textComponent1 = new Label("Letters: 0");
        Label textComponent2 = new Label("Words: 0");
        Label textComponent3 = new Label("The longest word is:");
        HBox bottomComponents = new HBox();
        
        bottomComponents.setSpacing(10);
        
        bottomComponents.getChildren().add(textComponent1);
        bottomComponents.getChildren().add(textComponent2);
        bottomComponents.getChildren().add(textComponent3);
 
        layout.setCenter(new TextArea(""));
        layout.setBottom(bottomComponents);
 
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}