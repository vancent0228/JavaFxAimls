//JavaFX视频教程第32课，TextArea基本使用
package Lesson032.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-backgroud-color:#ffffff");

        TextArea ta = new TextArea();
        ta.setText("ABCDEFG");
        ta.setFont(Font.font(16));
        //ta.setWrapText(true);

        //ta.setPrefRowCount(2);
        //ta.setPrefColumnCount(2);

        //ta.setPrefWidth(200);
        //ta.setPrefHeight(200);

        //ta.deleteText(0,3);

        //ta.insertText(2,"9");

        //ta.replaceText(2,3,"asdfasdfasdf");

        //ta.selectAll();

        //ta.appendText("234234");
        //ta.selectPositionCaret(4);

        //ta.getLength()

        //ta.selectRange(3,5);

        //ta.positionCaret(3);

        //ta.home();

        //ta.selectEnd();


        //ta.selectHome();

        ta.setEditable(true);



        an.getChildren().add(ta);

        Scene scene = new Scene(an,800,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第32课，TextArea基本使用");
        primaryStage.show();

        ta.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length()>10) {
                ta.setText(oldValue);
            }
        });
    }
}
