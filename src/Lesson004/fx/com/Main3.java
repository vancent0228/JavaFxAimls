package Lesson004.fx.com;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage[] s = {new Stage(),new Stage(),new Stage()};
        //StageStyle[] ss = {StageStyle.DECORATED,StageStyle.TRANSPARENT,StageStyle.UNIFIED,StageStyle.UTILITY,StageStyle.UNDECORATED};
        Modality[] mm ={Modality.WINDOW_MODAL,Modality.NONE,Modality.APPLICATION_MODAL};
        s[0].initOwner(s[2]);
        s[1].initOwner(s[2]);
        for (int i = 0; i < s.length ; i++) {
            s[i].setTitle("Title ->  "+mm[i]+"  ->  "+i);
            s[i].initModality(mm[i]);
            s[i].show();
        }

        //primaryStage.setTitle("JavaFX视频教程第4课，进一步认识stage窗口，模式，模态");
        //primaryStage.show();
    }
}
