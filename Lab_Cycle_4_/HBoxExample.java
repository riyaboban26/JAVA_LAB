import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    @Override
    public void start(Stage stage) {
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");

        HBox root = new HBox(10);
        root.getChildren().addAll(b1, b2, b3);

        Scene scene = new Scene(root, 300, 100);

        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
