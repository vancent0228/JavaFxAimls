//JavaFX视频教程第13课 AnchorPane布局类

package Lesson013.fx.com;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        b2.setLayoutY(60);
        b2.setLayoutX(60);
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");

        Group g1 = new Group();
        g1.getChildren().addAll(b1, b2);
        Group g2 = new Group();
        g2.getChildren().addAll(b3, b4);
        AnchorPane ap = new AnchorPane();
        //ap.setPadding(new Insets(10));
        ap.setTopAnchor(g1,100.0);
        ap.setLeftAnchor(g1,100.0);

        //b1.setLayoutX(100); 用 setTopAnchor 則 SetLayoutX 會失效
        //b1.setLayoutY(100);

        ap.getChildren().addAll(g1, g2);

        ap.setStyle("-fx-background-color:ff3e96");
        ap.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("123");
            }
        });

        Scene scene = new Scene(ap);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D rec = screen.getVisualBounds();
        primaryStage.setX(rec.getMinX());
        primaryStage.setY(rec.getMinY());
        primaryStage.setHeight(rec.getHeight() - 400);
        primaryStage.setWidth(rec.getWidth());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第13课 AnchorPane布局类");
        primaryStage.show();

    }
}
