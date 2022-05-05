package smiley;
 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
 
public class SmileyApplication extends Application {
 
    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        Canvas canvas = new Canvas(640, 480);
        Color white = Color.WHITE;
        Color black = Color.BLACK;
 
        GraphicsContext leftEye = canvas.getGraphicsContext2D();
        GraphicsContext rightEye = canvas.getGraphicsContext2D();
        GraphicsContext leftSmile = canvas.getGraphicsContext2D();
        GraphicsContext rightSmile = canvas.getGraphicsContext2D();
        GraphicsContext middleSmile = canvas.getGraphicsContext2D();
 
        leftEye.setFill(black);
        leftEye.fillRect(100, 100, 50, 50);
        
        rightEye.setFill(black);
        rightEye.fillRect(300, 100, 50, 50);
        
        leftSmile.setFill(black);
        leftSmile.fillRect(50, 250, 50, 50);
        
        rightSmile.setFill(black);
        rightSmile.fillRect(350, 250, 50, 50);
        
        middleSmile.setFill(black);
        middleSmile.fillRect(100, 300, 250, 50);
 
        layout.setCenter(canvas);
 
        Scene scene = new Scene(layout, 460, 460);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SmileyApplication.class);
    }
 
}