//JavaFX视频教程第38课，ComboBox的基本使用
package Lesson038.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button bu = new Button("button");
        ComboBox<String> cbb = new ComboBox<String>();
        cbb.getItems().addAll("str1", "str2", "str3", "str4", "str5");

        cbb.setEditable(true);
        cbb.setPromptText("請輸入.......");
        //cbb.setPlaceholder(new Button("我是站位的"));
        cbb.setVisibleRowCount(3);

        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");
        AnchorPane.setTopAnchor(cbb,100.0);
        AnchorPane.setLeftAnchor(cbb,10.0);
        an.getChildren().addAll(cbb,bu);

        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第38课，ComboBox的基本使用");
        primaryStage.show();

        cbb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
        });
    }
}