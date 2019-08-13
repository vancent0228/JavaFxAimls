//JavaFX视频教程第11课，设置快捷键
package Lesson011.fx.com;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.*;
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

        b1.setOnAction(e->{
            play();
        });

        Group root = new Group();
        root.getChildren().add(b1);
        Scene scene = new Scene(root);


        //第一種
        KeyCombination kc1 = new KeyCodeCombination(KeyCode.C, KeyCombination.ALT_DOWN, KeyCombination.CONTROL_DOWN);
        Mnemonic mnemonic1 = new Mnemonic(b1, kc1);
        scene.addMnemonic(mnemonic1);
        //第二種
        KeyCombination kc2 = new KeyCodeCombination(KeyCode.O, KeyCombination.ALT_DOWN);
        Mnemonic mnemonic2 = new Mnemonic(b1, kc2);
        scene.addMnemonic(mnemonic2);
        //第三種
        KeyCombination kc3 = new KeyCodeCombination(KeyCode.C, KeyCombination.ALT_DOWN, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN);
        Mnemonic mnemonic3 = new Mnemonic(b1, kc3);
        scene.addMnemonic(mnemonic3);
        //第四種 老師 推薦
        KeyCombination kccb = new KeyCodeCombination(KeyCode.Y,KeyCombination.SHORTCUT_DOWN);
        scene.getAccelerators().put(kccb, new Runnable() {
            @Override
            public void run() {
                System.out.println("run()");
                System.out.println(Thread.currentThread().getName());
                //play();
                b1.fire();
            }
        });

        //第五種
        KeyCombination kc5 = KeyCombination.valueOf("ctrl+alt+k");
        Mnemonic mnemonic5 = new Mnemonic(b1, kc5);
        scene.addMnemonic(mnemonic5);

        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D rec = screen.getVisualBounds();
        primaryStage.setX(rec.getMinX());
        primaryStage.setY(rec.getMinY());
        primaryStage.setHeight(rec.getHeight()-400);
        primaryStage.setWidth(rec.getWidth());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第11课，设置快捷键");
        primaryStage.show();

    }

    public static void play(){
        System.out.println("SetOnAction");
    }
}
