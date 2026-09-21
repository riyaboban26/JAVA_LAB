import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {

    @Override
    public void start(Stage stage) {
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup group = new ToggleGroup();

        male.setToggleGroup(group);
        female.setToggleGroup(group);

        Label result = new Label("Select gender");

        group.selectedToggleProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selected = (RadioButton) newValue;
                result.setText("Selected: " + selected.getText());
            }
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(male, female, result);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("RadioButton Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
