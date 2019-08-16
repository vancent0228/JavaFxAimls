//JavaFX视频教程第39课，ComboBox动态添加数据，和关键字搜索
package Lesson039.fx.com;

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
        primaryStage.setTitle("JavaFX视频教程第39课，ComboBox动态添加数据，和关键字搜索");
        primaryStage.show();
    }
}
