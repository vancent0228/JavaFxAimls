//main4 JavaFX视频教程第28课，CustomMenuItem，MenuButton，SplitMenuButton，ContextMenu

package Lesson028.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        Button button = new Button("button");
        an.getChildren().add(button);

        ContextMenu cm = new ContextMenu();
        MenuItem item1 = new MenuItem("MenuItem1");
        MenuItem item2 = new MenuItem("MenuItem2");
        MenuItem item3 = new MenuItem("MenuItem3");
        cm.getItems().addAll(item1, item2, item3);

        button.setContextMenu(cm);
        button.setOnContextMenuRequested(event -> {
            System.out.println("button.setOnContextMenuRequested");
            Button bu = (Button)event.getSource();
            System.out.println(bu.getText());
        });
        Scene scene = new Scene(an);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main4 JavaFX视频教程第28课，CustomMenuItem，MenuButton，SplitMenuButton，ContextMenu");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
