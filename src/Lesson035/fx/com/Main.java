//JavaFX视频教程第35课，ButtonBar的使用
package Lesson035.fx.com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        ButtonBar buttonBar = new ButtonBar();

        Button b1 = new Button("Apply");
        Button b2 = new Button("Finsh");
        Button b3 = new Button("No");

        //b1.setPrefWidth(200);
       // b1.setPrefHeight(100);

        ButtonBar.setButtonData(b1, ButtonBar.ButtonData.APPLY);
        ButtonBar.setButtonData(b2, ButtonBar.ButtonData.FINISH);
        ButtonBar.setButtonData(b3, ButtonBar.ButtonData.NO);

        buttonBar.getButtons().addAll(b1,b2,b3);

        //buttonBar.setButtonOrder(ButtonBar.BUTTON_ORDER_WINDOWS);
        //ButtonBar.setButtonUniformSize(b1,true);
        an.getChildren().addAll(buttonBar);


        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第35课，ButtonBar的使用");
        primaryStage.show();

        b1.setOnAction(this);
        b2.setOnAction(this);
        b3.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent event) {
        Button bu = (Button)event.getSource();
        if (ButtonBar.getButtonData(bu) == ButtonBar.ButtonData.APPLY) {
            System.out.println("APPLY");
        }else
        if (ButtonBar.getButtonData(bu) == ButtonBar.ButtonData.FINISH) {
            System.out.println("FINISH");
        }else
        if (ButtonBar.getButtonData(bu) == ButtonBar.ButtonData.NO) {
            System.out.println("NO");
        }
    }
}