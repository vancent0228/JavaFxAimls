//JavaFX视频教程第25课 Hyperlink简单使用
package Lesson025.fx.com;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox();
        Hyperlink link = new Hyperlink("www.google.com",new Button("網址"));
        link.setOnAction(e->{
            HostServices host = Main.this.getHostServices();
            host.showDocument(link.getText());
        });
        box.getChildren().addAll(link);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第25课 Hyperlink简单使用");
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
