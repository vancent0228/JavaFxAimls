//JavaFX视频教程第31课，RadioButton和CheckBox
package Lesson031.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
        an.setStyle("-fx-backgroup-color:#ffffff");

        HBox box = new HBox(10);


        RadioButton r1 = new RadioButton("r1");
        RadioButton r2 = new RadioButton("r2");
        RadioButton r3 = new RadioButton("r3");
        RadioButton r4 = new RadioButton("r4");

        //r2.setSelected(true);

        ToggleGroup tg= new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        r4.setToggleGroup(tg);

        //tg.selectToggle(r3);

        box.getChildren().addAll(r1, r2, r3, r4);

        AnchorPane.setTopAnchor(box,100.0);
        AnchorPane.setLeftAnchor(box,100.0);

        an.getChildren().addAll(box);
        Scene scene = new Scene(an,800,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第31课，RadioButton和CheckBox");
        primaryStage.show();

        //r1.selectedProperty().addListener((observable, oldValue, newValue) -> {
        //    System.out.println(newValue);
        //});

        tg.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            RadioButton r = (RadioButton)newValue;
            System.out.println(r.getText());
        });
    }
}
