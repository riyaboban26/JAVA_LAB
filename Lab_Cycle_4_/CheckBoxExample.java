import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {

    @Override
    public void start(Stage stage) {
        CheckBox java = new CheckBox("Java");
        CheckBox python = new CheckBox("Python");
        Label result = new Label();

        java.setOnAction(e -> {
            result.setText("Java selected: " + java.isSelected());
        });

        python.setOnAction(e -> {
            result.setText("Python selected: " + python.isSelected());
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(java, python, result);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("CheckBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
