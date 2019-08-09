
//JavaFX视频教程第2课，application的启动方式和生命周期

package Lesson002.fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main4 extends Application {
    public static void main(String[] args) {
        System.out.println("before launch ->  "+Thread.currentThread().getName());
        launch(Main4.class, args);
        System.out.println("after launch ->  "+Thread.currentThread().getName());
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init -> "+Thread.currentThread().getName());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("這是start方法 Main2 ->  "+Thread.currentThread().getName());
        primaryStage.show();
        primaryStage.setTitle("Lesson002 Main2 ->  "+Thread.currentThread().getName());
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("stop ->  "+Thread.currentThread().getName());
    }

}
