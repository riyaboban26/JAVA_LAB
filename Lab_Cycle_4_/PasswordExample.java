import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordExample extends Application {

    @Override
    public void start(Stage stage) {
        PasswordField password = new PasswordField();
        password.setPromptText("Enter password");

        Button button = new Button("Login");
        Label label = new Label();

        button.setOnAction(e -> {
            if (password.getText().equals("1234")) {
                label.setText("Login Successful");
            } else {
                label.setText("Invalid Password");
            }
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(password, button, label);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Password Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
