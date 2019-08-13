//JavaFX视频教程第22课，DialogPane类和ScheduledService多任务的简单使用
package Lesson022.fx.com;

import javafx.application.Application;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("點擊顯示窗口");
        button.setFont(Font.font(20));
        button.setOnAction(e -> {
            DialogPane dapne = new DialogPane();
            dapne.setHeaderText("HeaderText");
            dapne.setContentText("ContentText");
            dapne.getButtonTypes().addAll(ButtonType.APPLY, ButtonType.CLOSE);
            Button apply = (Button) dapne.lookupButton(ButtonType.APPLY);
            apply.setOnAction(event -> {
                System.out.println("Apply");
            });
            Button close = (Button) dapne.lookupButton(ButtonType.CLOSE);
            close.setOnAction(event -> {
                System.out.println("Close");
            });

            ImageView im = new ImageView(Main.class.getResource("icon.png").toString());
            dapne.setGraphic(im);

            dapne.setExpandableContent(new Text("這是擴展內容"));

            dapne.setExpanded(false);

            Stage stage = new Stage();
            Scene scene = new Scene(dapne);
            stage.setScene(scene);
            stage.initOwner(primaryStage);
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle("這是彈出的窗口");
            stage.setAlwaysOnTop(true);
            stage.setResizable(false);
            stage.show();

            MyScheduledService my = new MyScheduledService(dapne,stage);
            my.setDelay(Duration.millis(0));
            my.setPeriod(Duration.millis(1000));
            my.start();

        });

        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");
        an.setTopAnchor(button, 100.0);
        an.setLeftAnchor(button, 100.0);

        an.getChildren().addAll(button);
        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第22课，DialogPane类和ScheduledService多任务的简单使用");
        primaryStage.show();
    }
}

class MyScheduledService extends ScheduledService <Integer> {
    int i=0;

    private DialogPane di = null;
    private Stage stage = null;

    public MyScheduledService(DialogPane di,Stage stage) {
        this.di=di;
        this.stage=stage;
    }
    @Override
    protected Task<Integer> createTask() {
        return new Task<Integer>() {
            @Override
            protected Integer call() throws Exception {
                System.out.println("call ="+Thread.currentThread().getName());
                return ++i;
            }

            @Override
            protected void updateValue(Integer value) {
                super.updateValue(value);
                System.out.println("updateValue "+Thread.currentThread().getName());
                System.out.println("updateValue 的值 = "+value);

                if (value > 10) {
                    stage.close();
                    MyScheduledService.this.cancel();
                } else {
                    MyScheduledService.this.di.setContentText(" value is"+value);
                }
            }
        };
    }
}
