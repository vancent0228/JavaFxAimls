//JavaFX视频教程第36课，ChoiceBox的使用和加载对象类型数据，以及数据源排序
package Lesson036.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        ChoiceBox<String> cb = new ChoiceBox<>();
        cb.getItems().addAll("str1", "str2", "str3");
        cb.setValue("str2");

        cb.getSelectionModel().select("str3");



        cb.setPrefWidth(100);
        AnchorPane.setTopAnchor(cb,100.0);
        AnchorPane.setLeftAnchor(cb,10.0);
        an.getChildren().addAll(cb);
        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第36课，ChoiceBox的使用和加载对象类型数据，以及数据源排序");
        primaryStage.show();

        cb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
        });
    }
}

