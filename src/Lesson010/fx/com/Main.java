//JavaFX视频教程第10课，双击事件和检测键盘按键
package Lesson010.fx.com;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("B1");
        b1.setLayoutX(100);
        b1.setLayoutY(100);
        b1.setPrefHeight(200);
        b1.setPrefWidth(400);
        b1.setFont(Font.font(40));

        //b1.setOnAction(new EventHandler<ActionEvent>() {
        //    @Override
        //    public void handle(ActionEvent event) {
        //        System.out.println("單擊事件");
        //    }
        //});

        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                    System.out.println("鼠標按鍵 = " + event.getButton().name());
                if (event.getClickCount() == 2 &&
                        event.getButton().equals(MouseButton.PRIMARY)
                ) {
                    System.out.println("if 裏 鼠標按鍵 = " + event.getButton().name());
                    System.out.println("鼠標雙擊");
                }
            }
        });

        b1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.A))
                System.out.println("按下 key = "+event.getCode().getName()
                        );
            }
        });

        b1.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.A))
                System.out.println("釋放 key = "+event.getCode().getName());
            }
        });

        Group root = new Group();
        root.getChildren().add(b1);
        Scene scene = new Scene(root);

        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D rec = screen.getVisualBounds();
        primaryStage.setX(rec.getMinX());
        primaryStage.setY(rec.getMinY());
        primaryStage.setHeight(rec.getHeight());
        primaryStage.setWidth(rec.getWidth());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第10课，双击事件和检测键盘按键");
        primaryStage.show();

    }
}
