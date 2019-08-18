//JavaFX视频教程第40课，javafx中的setCellFactory方法解析，自定义单元格
package Lesson040.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class MainTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();

        HBox box = new HBox(10);
        box.setPadding(new Insets(20));
        box.getChildren().addAll(new Button("button1"),new Button("button2"));

        Label l1 = new Label();
        l1.setStyle("-fx-background-color:#ffff55");
        //l1.setText("這是Label");

        l1.setGraphic(box);
        l1.setContentDisplay(ContentDisplay.RIGHT);

        AnchorPane.setTopAnchor(l1,100.0);
        AnchorPane.setLeftAnchor(l1,10.0);
        an.getChildren().addAll(l1);

        Scene scene = new Scene(an,800,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第40课，javafx中的setCellFactory方法解析，自定义单元格");
        primaryStage.show();
    }
}
