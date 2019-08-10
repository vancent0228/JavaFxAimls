
//JavaFX视频教程第5课platform类的使用

package Lesson05.fx.com;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Platform.runLater 是隊列 不是 多任務。因爲都是同一個綫程。runLater() = JavaFX Application Thread
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("runLater() = "+Thread.currentThread().getName());
                for (int i = 1; i <= 10 ; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        System.out.println("runLater 下面 = "+Thread.currentThread().getName());

        primaryStage.setTitle("JavaFX视频教程第5课platform类的使用");
        primaryStage.show();
    }
}
