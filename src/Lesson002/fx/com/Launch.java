package Lesson002.fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Launch extends Application {
    public static void main(String[] args) {
        launch(Launch.class,args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("這是start方法 Launch");
        primaryStage.show();
        primaryStage.setTitle("Lesson002 Launch");
    }
}
