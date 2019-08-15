package Lesson000.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }
}
