//JavaFX视频教程第14课 HBox和VBox

package Lesson014.fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane ap = new AnchorPane();
        AnchorPane ap2 = new AnchorPane();

        ap2.setStyle("-fx-background-color:#9bcd9b");
        ap.setStyle("-fx-background-color:#ff3e96");

        ap.getChildren().add(ap2);

        ap.setTopAnchor(ap2, 0.0);
        ap.setLeftAnchor(ap2, 0.0);

        ap2.setPrefWidth(100);
        ap2.setPrefHeight(100);

        Scene scene = new Scene(ap);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D rec = screen.getVisualBounds();
        primaryStage.setX(rec.getMinX());
        primaryStage.setY(rec.getMinY());
        primaryStage.setHeight(rec.getHeight() - 400);
        primaryStage.setWidth(rec.getWidth());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第14课 HBox和VBox");
        primaryStage.show();
    }
}
