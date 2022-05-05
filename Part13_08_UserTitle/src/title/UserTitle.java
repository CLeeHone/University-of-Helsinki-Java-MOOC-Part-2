package title;
 
import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;
 
public class UserTitle extends Application {
    
    @Override
    public void start(Stage stage) {
        Parameters parameters = getParameters();
        String title = parameters.getNamed().get("title");
 
        stage.setTitle(title);
        stage.show();
    }
    
}