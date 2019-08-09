package Lesson004.fx.com;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX视频教程第4课，进一步认识stage窗口，模式，模态 main2");

        Stage[] s = {new Stage(),new Stage(),new Stage(),new Stage(),new Stage()};
        StageStyle[] ss = {StageStyle.DECORATED,StageStyle.TRANSPARENT,StageStyle.UNIFIED,StageStyle.UTILITY,StageStyle.UNDECORATED};
        for (int i = 0; i < s.length ; i++) {
            s[i].setTitle("Title ->  "+ss[i]+"  ->  "+i);
            s[i].initStyle(ss[i]);
            s[i].show();

        }
        primaryStage.show();
    }
}
