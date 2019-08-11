//JavaFX视频教程第15课setManaged，setVisible，setOpacity

package Lesson015.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    static boolean isManaged = false;
    static boolean isVisible = false;
    static double OpacityValue = 0;
    Label label=new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox = new HBox();
        VBox vbox = new VBox();

        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");

        Button b5 = new Button("b3.setManaged(false)");
        b5.setOnAction(e -> {
            b3.setManaged(isManaged);
            new Print(hbox);
            isManaged = !isManaged;
            b5.setText("b3.setManaged(" + isManaged + ")");
        });

        Button b6 = new Button("b3.setVisible(false)");
        b6.setOnAction(e -> {
            b3.setVisible(isVisible);
            new Print(hbox);
            isVisible = !isVisible;
            b6.setText("b3.setVisible(" + isVisible + ")");
        });

        Button b7 = new Button("b3.setOpacity(0)");
        b7.setOnAction(e -> {
            b3.setOpacity(OpacityValue);
            new Print(hbox);
            OpacityValue = (OpacityValue == 0) ? 1 : 0;
            b7.setText("b3.setOpacity(" + OpacityValue + ")");
        });
        //b3.setManaged(false);
        //b3.setVisible(false);
        //b3.setOpacity(0);

        AnchorPane ap = new AnchorPane();

        ap.setStyle("-fx-background-color:#ffffff");

        hbox.setPadding(new Insets(20));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(b1, b2, b3, b4);

        vbox.setSpacing(10);
        vbox.getChildren().addAll(b5, b6, b7,label);

        ap.setTopAnchor(vbox, 100.0);
        ap.setLeftAnchor(vbox, 20.0);

        ap.getChildren().addAll(hbox, vbox);

        Scene scene = new Scene(ap);
        primaryStage.setScene(scene);
        primaryStage.setHeight(400);
        primaryStage.setWidth(800);
        primaryStage.setTitle("JavaFX视频教程第15课setManaged，setVisible，setOpacity");
        primaryStage.show();
    }

    class Print{
        Print(HBox hbox) {
            label.setText("當前HBox裏子組件的數量: "+hbox.getChildren().size());
        }
    }
}
