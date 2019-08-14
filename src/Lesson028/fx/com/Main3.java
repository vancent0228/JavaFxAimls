//main3 JavaFX视频教程第28课，CustomMenuItem，MenuButton，SplitMenuButton，ContextMenu

package Lesson028.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("menu1");
        Menu menu2 = new Menu("menu2");
        Menu menu3 = new Menu("menu3");

        MenuItem item1 = new MenuItem("MenuItem1");
        MenuItem item2 = new MenuItem("MenuItem2");
        MenuItem item3 = new MenuItem("MenuItem3");


        SplitMenuButton smb = new SplitMenuButton();
        smb.setText("SplitMenuButton");
        MenuItem item4 = new MenuItem("MenuItem4");
        MenuItem item5 = new MenuItem("MenuItem5");
        MenuItem item6 = new MenuItem("MenuItem6");
        smb.getItems().addAll(item4, item5, item6);


        menu1.getItems().addAll(item1,item2,item3);

        menuBar.getMenus().addAll(menu1, menu2, menu3);

        an.getChildren().addAll(menuBar,smb);

        Scene scene = new Scene(an);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main3 JavaFX视频教程第28课，CustomMenuItem，MenuButton，SplitMenuButton，ContextMenu");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        menuBar.setPrefWidth(primaryStage.getWidth());
        an.widthProperty().addListener(event -> {
            menuBar.setPrefWidth(primaryStage.getWidth());
        });
        AnchorPane.setTopAnchor(smb,200.0);
    }
}
