//JavaFX视频教程第16课 BorderPane布局类
package Lesson016.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click Me");
        AnchorPane a1 = new AnchorPane();
        a1.setStyle("-fx-background-color:#ee6aa7");
        a1.setPrefWidth(100);
        a1.setPrefHeight(100);
        a1.getChildren().add(btn);
        AnchorPane a2 = new AnchorPane();
        a2.setStyle("-fx-background-color:#98fb98");
        a2.setPrefWidth(100);
        a2.setPrefHeight(100);
        AnchorPane a3 = new AnchorPane();
        a3.setStyle("-fx-background-color:#a0522d");
        a3.setPrefWidth(100);
        a3.setPrefHeight(100);
        AnchorPane a4 = new AnchorPane();
        a4.setStyle("-fx-background-color:#1e90ff");
        a4.setPrefWidth(100);
        a4.setPrefHeight(100);
        AnchorPane a5 = new AnchorPane();
        a5.setStyle("-fx-background-color:#eeee00");
        //a5.setPrefWidth(100);
        //a5.setPrefHeight(100);

        BorderPane bor = new BorderPane();
        bor.setStyle("-fx-background-color:#b23aee");

        bor.setTop(a1);
        //bor.setBottom(a2);
        bor.setLeft(a3);
        bor.setRight(a4);
        bor.setCenter(a5);

        //Button bu = (Button) bor.getTop();
        //System.out.println(bu.getText());

        //bor.setPadding(new Insets(10));
        //bor.setMargin(a1,new Insets(10));
        //bor.setAlignment(btn, Pos.BOTTOM_CENTER);

        Scene scene = new Scene(bor,800,800);

        primaryStage.setScene(scene);

        primaryStage.setTitle("JavaFX视频教程第16课 BorderPane布局类");
        primaryStage.show();
    }
}
