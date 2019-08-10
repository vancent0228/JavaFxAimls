//JavaFX视频教程第7课 scene类，和两个小知识

package Lesson07.fx.com;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //以預設的瀏覽器開啓網頁
        HostServices host = getHostServices();
        host.showDocument("www.yahoo.com");




        //取得資源
        URL url = Main.class.getResource("icon.png");
        //取得路徑
        String path=url.toExternalForm();

        System.out.println(path);
        Button button = new Button("按鈕");
        button.setPrefWidth(200);
        button.setPrefHeight(200);

        Group group = new Group();
        group.getChildren().add(button);

        Scene scene = new Scene(group);

        scene.setCursor(Cursor.cursor(path));
        //scene.setCursor(Cursor.WAIT);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第7课 scene类，和两个小知识");
        primaryStage.setHeight(400);
        primaryStage.setWidth(800);
        primaryStage.show();
    }
}
