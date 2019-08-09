package Lesson002.fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("這是start方法");
        primaryStage.show();
        primaryStage.setTitle("Lesson002");
    }
}
