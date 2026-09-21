import javafx.application.Application;
import javafx.stage.Stage;

public class TestFX extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Test");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



//javac --module-path "C:\Users\boban\Downloads\javafx-26_windows-x64_bin-sdk\javafx-sdk-26.0.2\lib" --add-modules javafx.controls TestFX.java
