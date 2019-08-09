//JavaFX视频教程第4课，进一步认识stage窗口，模式，模态

package Lesson004.fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX视频教程第4课，进一步认识stage窗口，模式，模态 main");
        //primaryStage.setOpacity(0.5);  設置透明度
        //primaryStage.setAlwaysOnTop(true);  設置置頂
        primaryStage.setHeight(400);
        primaryStage.setWidth(400);
        primaryStage.setX(10.0f);
        primaryStage.setY(10.0f);

        primaryStage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("X = "+newValue.doubleValue());
            }
        });

        primaryStage.yProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Y = "+newValue.doubleValue());
            }
        });



        primaryStage.show();
    }
}
