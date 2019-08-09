//JavaFX视频教程第3课初步认识stage窗口
package Lesson003.fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("這是第3課 講 Stage = Window");

        primaryStage.getIcons().add(new Image(Main.class.getResource("boost.png").toString()));

        //primaryStage.setIconified(true); //設置最小化

        //primaryStage.setMaximized(true); //設置最大化

        //primaryStage.close(); //關閉窗口

        //primaryStage.setWidth(500);
        //primaryStage.setHeight(500);

        //primaryStage.setResizable(false);

        //primaryStage.setMaxWidth(800);
        //primaryStage.setMaxHeight(800);

        //primaryStage.setMinWidth(300);
        //primaryStage.setMinHeight(300);

        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("高度: " + primaryStage.getHeight());
            }
        });

        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("寬度: " + newValue.doubleValue());
            }
        });

        primaryStage.setFullScreen(true);
        primaryStage.setScene(new Scene(new Group()));

        primaryStage.show();

    }
}
