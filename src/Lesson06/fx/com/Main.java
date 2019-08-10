
//JavaFX视频教程第6课screen类

package Lesson06.fx.com;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.geom.Rectangle2D;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Screen screen = Screen.getPrimary();

        javafx.geometry.Rectangle2D rec1 = screen.getBounds();

        javafx.geometry.Rectangle2D rec2 = screen.getVisualBounds();

        System.out.println(rec1);
        System.out.println(rec2);

        double dpi=screen.getDpi();
        System.out.println("screen dpi ="+dpi);

        primaryStage.setTitle("JavaFX视频教程第6课screen类");
        primaryStage.show();
    }
}
