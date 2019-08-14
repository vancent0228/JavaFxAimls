//main2 JavaFX视频教程第31课，RadioButton和CheckBox
package Lesson031.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-backgroup-color:#ffffff");

        HBox box = new HBox(10);


        CheckBox c1 = new CheckBox("r1");
        CheckBox c2 = new CheckBox("r2");
        CheckBox c3 = new CheckBox("r3");
        CheckBox c4 = new CheckBox("r4");

        c1.setSelected(true);

        c2.setIndeterminate(true);

        c3.setAllowIndeterminate(true);

        box.getChildren().addAll(
                c1,
                c2,
                c3,
                c4);

        AnchorPane.setTopAnchor(box,100.0);
        AnchorPane.setLeftAnchor(box,100.0);

        an.getChildren().addAll(box);
        Scene scene = new Scene(an,800,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("main2 JavaFX视频教程第31课，RadioButton和CheckBox");
        primaryStage.show();

        c3.selectedProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
        });

        an.setOnMouseClicked(event -> {
            box.getChildren().forEach(e->{
                CheckBox c =(CheckBox)e;
                System.out.println(c.getText()+" "+c.isSelected()+ " "+c.isIndeterminate());
            });
        });
    }
}
