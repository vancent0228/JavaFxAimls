package Lesson002.fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(Main2.class,args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("這是start方法 Main2");
        primaryStage.show();
        primaryStage.setTitle("Lesson002 Main2");
    }
}
