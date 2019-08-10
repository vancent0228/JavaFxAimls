//JavaFX视频教程第9课，Button按钮以及简单介绍设置背景颜色和外边框等问题
package Lesson009.fx.com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button bx;
        Button b1 = new Button("b1字體");
        Button b2 = new Button("b2字體");

        bx = b1;
        int x, y;
        x = 0;
        y = 20;
        bx.setLayoutX(x);
        bx.setLayoutY(y);
        bx.setFont(Font.font("sans-serif", 20));
        //bx.setTextFill(Paint.valueOf("#cd0000"));

        //BackgroundFill bgf = new BackgroundFill(Paint.valueOf("#8fbc8f"), new CornerRadii(5), new Insets(2));
        //Background bg=new Background(bgf);
        //bx.setBackground(bg);
        //BorderStroke bos = new BorderStroke(Paint.valueOf("#8a2be2"),BorderStrokeStyle.DASHED,new CornerRadii(5),new BorderWidths(1));
        //Border bo = new Border(bos);
        //bx.setBorder(bo);

        bx.setStyle(
                "-fx-background-color:#7ccd7c;" +
                        "-fx-background-radius:20;"+
                        "-fx-text-fill:#5cacee;"
        );

        bx.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button bu=(Button)event.getSource();
                System.out.println(bu.getText());
            }
        });

        bx = b2;
        x = 100;
        y = 20;
        bx.setLayoutX(x);
        bx.setLayoutY(y);
        bx.setFont(Font.font("sans-serif", 20));

        Group group = new Group();
        group.getChildren().addAll(b1, b2);

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第9课，Button按钮以及简单介绍设置背景颜色和外边框等问题");
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
