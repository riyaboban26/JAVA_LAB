import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldExample extends Application {

    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        textField.setPromptText("Enter your name");

        Button button = new Button("Display");
        Label label = new Label();

        button.setOnAction(e -> {
            label.setText("Hello " + textField.getText());
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(textField, button, label);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("TextField Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
