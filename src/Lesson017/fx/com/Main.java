//JavaFX视频教程第17课 FlowPane布局类
package Lesson017.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button1");
        Button b2 = new Button("button2");
        Button b3 = new Button("button3");
        Button b4 = new Button("button4");
        Button b5 = new Button("button5");
        Button b6 = new Button("button6");
        Button b7 = new Button("button7");
        Button b8 = new Button("button8");

        FlowPane flow = new FlowPane();
        flow.setStyle("-fx-background-color:#ee6aa7");
        flow.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8);

        flow.setPadding(new Insets(10));
        //flow.setMargin(b1,new Insets(10));
        flow.setAlignment(Pos.CENTER_LEFT);
        flow.setHgap(5);
        flow.setVgap(20);
        flow.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(flow,800,800);

        primaryStage.setScene(scene);

        primaryStage.setTitle("JavaFX视频教程第17课 FlowPane布局类");
        primaryStage.show();
    }
}
