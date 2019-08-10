package Lesson05.fx.com;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Platform.setImplicitExit(false); //為false時候只有調用Platform.exit()可離開程式。
        System.out.println(
                Platform.isSupported(ConditionalFeature.SCENE3D)+", "+
                Platform.isSupported(ConditionalFeature.FXML)
        );
        primaryStage.setTitle("JavaFX视频教程第5课platform类的使用 Main2");
        primaryStage.show();

        //Platform.exit();
    }
}
