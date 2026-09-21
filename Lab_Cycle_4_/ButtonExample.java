import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonExample extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Press the button");
        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            label.setText("Button Clicked!");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Button Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
