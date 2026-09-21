import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShapesExample extends Application {

    @Override
    public void start(Stage stage) {

        Circle circle = new Circle(70, 70, 40);
        circle.setFill(Color.BLUE);

        Rectangle rectangle = new Rectangle(130, 40, 100, 60);
        rectangle.setFill(Color.GREEN);

        Line line = new Line(50, 150, 250, 150);
        line.setStroke(Color.RED);
        line.setStrokeWidth(3);

        Pane root = new Pane();
        root.getChildren().addAll(circle, rectangle, line);

        Scene scene = new Scene(root, 300, 220);

        stage.setTitle("Shapes and Colors");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
