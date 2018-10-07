package refactoring.solution5;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Driver extends Application {
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage.setTitle("Movie Rentals");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

}