//JavaFX视频教程第13课 AnchorPane布局类

package Lesson013.fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");

        AnchorPane ap = new AnchorPane();
        AnchorPane ap2 = new AnchorPane();

        ap2.setStyle("-fx-background-color:#9bcd9b");
        ap.setStyle("-fx-background-color:#ff3e96");

        //b1.setManaged(false); 脫離管理
        //b1.setVisible(ture);
        //b1.setOpacity(1);

        ap2.getChildren().add(b1);
        ap2.setRightAnchor(b1, 0.0);
        ap2.setBottomAnchor(b1, 0.0);

        ap.getChildren().add(ap2);

        Scene scene = new Scene(ap);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D rec = screen.getVisualBounds();
        primaryStage.setX(rec.getMinX());
        primaryStage.setY(rec.getMinY());
        primaryStage.setHeight(rec.getHeight() - 400);
        primaryStage.setWidth(rec.getWidth());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第13课 AnchorPane布局类 main2");
        primaryStage.show();

        ap.setTopAnchor(ap2, 20.0);
        ap.setLeftAnchor(ap2, 20.0);
        ap.setRightAnchor(ap2, ap.getWidth() / 2);
        ap.setBottomAnchor(ap2, ap.getHeight() / 2);

        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                ap.setBottomAnchor(ap2, ap.getHeight() / 2);
            }
        });

        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                ap.setRightAnchor(ap2, ap.getWidth() / 2);
            }
        });
    }
}
