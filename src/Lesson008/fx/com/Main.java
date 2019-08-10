//JavaFX视频教程第8课Group容器的使用

package Lesson008.fx.com;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    int ii=0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button bx;
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        int x = 0, y = 0;
        x = 0;
        y = 10;
        bx = b1;
        bx.setLayoutX(x);
        bx.setLayoutY(y);
        bx.setPrefWidth(100);
        bx.setPrefHeight(50);
        x = 200;
        y = 10;
        bx = b2;
        bx.setLayoutX(x);
        bx.setLayoutY(y);
        bx.setPrefWidth(100);
        bx.setPrefHeight(50);

        x = 400;
        y = 10;
        bx = b3;
        bx.setLayoutX(x);
        bx.setLayoutY(y);
        bx.setPrefWidth(100);
        bx.setPrefHeight(50);


        Group group = new Group();
        group.getChildren().addAll(b1, b2, b3);

        //System.out.println(group.contains(0,10));
        //group.setOpacity(0.5);
        //group.setAutoSizeChildren(false);
        //group.getChildren().remove(b1);
        //group.getChildren().clear();
        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> c) {
                System.out.println("當前組件數量: "+c.getList().size());
            }
        });


        Object[] obj = group.getChildren().toArray();
        System.out.println(obj.length);

        for (Object o : obj
        ) {
            Button btn = (Button) o;
            btn.setPrefWidth(100);
            btn.setPrefHeight(100);
        }


        b1.setOnAction(new EventHandler<ActionEvent>() {
                           @Override
                           public void handle(ActionEvent event) {
                               ii+=40;
                               Button b4=new Button("b4 -> "+ii);
                               b4.setLayoutX(600);
                               b4.setLayoutY(ii);
                               group.getChildren().add(b4);
                           }
                       }
                //    e->{
                //i+=10;
                //Button b4=new Button("b4");
                //group.getChildren().add(b4);
                //}
        );

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);

        primaryStage.setTitle("JavaFX视频教程第8课Group容器的使用");
        primaryStage.setHeight(400);
        primaryStage.setWidth(800);
        primaryStage.show();
    }
}
