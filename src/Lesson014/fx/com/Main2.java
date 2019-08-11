//JavaFX视频教程第14课 HBox和VBox

package Lesson014.fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button1");
        Button b2 = new Button("button2");
        Button b3 = new Button("button3");

        AnchorPane ap = new AnchorPane();
        ap.setStyle("-fx-background-color:#aeeeee");

        HBox box = new HBox();
        box.setPrefWidth(400);
        box.setPrefHeight(400);

        box.setPadding(new Insets(10));
        box.setSpacing(10);
        box.setMargin(b1, new Insets(10));
        box.setAlignment(Pos.TOP_CENTER);

        box.setStyle("-fx-background-color:#e066ff");
        box.getChildren().addAll(b1, b2, b3);

        ap.getChildren().add(box);

        Scene scene = new Scene(ap);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D rec = screen.getVisualBounds();
        primaryStage.setX(rec.getMinX());
        primaryStage.setY(rec.getMinY());
        primaryStage.setHeight(rec.getHeight() - 400);
        primaryStage.setWidth(rec.getWidth());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JJavaFX视频教程第14课 HBox和VBox main2");
        primaryStage.show();

    }
}
