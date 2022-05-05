package textstatistics;
 
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class TextStatisticsApplication extends Application {
 
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
 
    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        HBox bottomComponents = new HBox();
        TextArea centerText = new TextArea();
        Label longestWord = new Label("The longest word is: ");
        Label characterCount = new Label("Letters: ");
        Label wordCount = new Label("Words: ");
 
        centerText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
 
            longestWord.setText("The longest word is: " + longest);
            characterCount.setText("Letters: " + String.valueOf(characters));
            wordCount.setText("Words: " + String.valueOf(words));
        });
 
        bottomComponents.setSpacing(10);
        bottomComponents.getChildren().addAll(characterCount, wordCount, longestWord);
 
        layout.setCenter(centerText);
        layout.setBottom(bottomComponents);
 
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }
    
}