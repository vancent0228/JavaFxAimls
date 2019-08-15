//JavaFX视频教程第35课，ButtonBar的使用
package Lesson035.fx.com;

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
        primaryStage.setTitle("JavaFX视频教程第35课，ButtonBar的使用");
        primaryStage.show();
    }
}