//JavaFX视频教程第28课，CustomMenuItem，MenuButton，SplitMenuButton，ContextMenu

package Lesson028.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
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

        CustomMenuItem cmi1 = new CustomMenuItem();
        Button button = new Button("button");
        cmi1.setContent(button);

        CustomMenuItem cmi2 = new CustomMenuItem();
        ProgressBar bar = new ProgressBar(0.5);
        cmi2.setContent(bar);
        CustomMenuItem cmi3 = new CustomMenuItem();
        HBox box = new HBox();
        box.setStyle("-fx-background-color:#ffffff");
        box.setPadding(new Insets(10));
        box.getChildren().addAll(new Button("b1"), new Button("b2"), new Button("b3"));
        cmi3.setContent(box);

        menu1.getItems().addAll(item1,item2,item3,cmi1,cmi2,cmi3);

        menuBar.getMenus().addAll(menu1, menu2, menu3);

        an.getChildren().add(menuBar);

        Scene scene = new Scene(an);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第28课，CustomMenuItem，MenuButton，SplitMenuButton，ContextMenu");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        menuBar.setPrefWidth(primaryStage.getWidth());
        an.widthProperty().addListener(event -> {
            menuBar.setPrefWidth(primaryStage.getWidth());
        });
    }
}
