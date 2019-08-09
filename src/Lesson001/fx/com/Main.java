
//JavaFX视频教程第1课，hello world

package Lesson001.fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("這是第一個javafx程序");
        primaryStage.show();
    }
}
