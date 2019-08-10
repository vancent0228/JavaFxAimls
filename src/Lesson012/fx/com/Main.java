//JavaFX视频教程第12课，输入框，密码框，标签，实用技术
package Lesson012.fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField text = new TextField();
        //text.setText("這是文本");

        text.setLayoutX(100);
        text.setLayoutY(100);

        //text.setPrefHeight(100);
        //text.setPrefWidth(300);

        text.setFont(Font.font(14));

        Tooltip tip = new Tooltip();
        tip.setText("這是提示。。。");
        tip.setFont(Font.font(40));
        text.setTooltip(tip);

        text.setPromptText("請輸入7個字以下");
        text.setFocusTraversable(false);

        text.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
                if (newValue.length() > 7) {
                    text.setText(oldValue);
                }
            }
        });

        text.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });

        //PasswordField
        PasswordField ptext = new PasswordField();
        ptext.setFocusTraversable(true);
        ptext.setLayoutX(300);
        ptext.setLayoutY(100);
        ptext.setPromptText("請輸入7個字以下的密碼");

        //ptext.setPrefHeight(100);
        //ptext.setPrefWidth(300);

        ptext.setFont(Font.font(14));
        ptext.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
                if (newValue.length() > 7) {
                    ptext.setText(oldValue);
                }
            }
        });

        //Label
        Label label = new Label("我是標簽:");
        label.setLayoutX(10);
        label.setLayoutY(100);

        //label.setPrefHeight(100);
        //label.setPrefWidth(300);

        label.setFont(Font.font(14));



        Group root = new Group();

        root.getChildren().add(text);
        root.getChildren().add(ptext);
        root.getChildren().add(label);

        Scene scene = new Scene(root);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D rec = screen.getVisualBounds();
        primaryStage.setX(rec.getMinX());
        primaryStage.setY(rec.getMinY());
        primaryStage.setHeight(rec.getHeight() - 400);
        primaryStage.setWidth(rec.getWidth());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第12课，输入框，密码框，标签，实用技术");
        primaryStage.show();
    }
}
