//JavaFX视频教程第20课 TextFlow布局类
package Lesson020.fx.com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();

        Text t1 = new Text("這裏依舊是B站沒人看系列");
        Text t2 = new Text("JavaFX視頻教程");
        Text t3 = new Text("Hello World");

        t1.setFont(Font.font(20));
        t1.setFill(Paint.valueOf("#ff82ab"));

        t2.setFont(Font.font("Helvetica", FontPosture.ITALIC,40));

        t3.setFont(Font.font("Helvetica", FontWeight.BLACK,20));





        TextFlow textFlow = new TextFlow();
        textFlow.setStyle("-fx-background-color:#eecfa1");

        textFlow.setPadding(new Insets(10));
        textFlow.setTextAlignment(TextAlignment.LEFT);
        //textFlow.setLineSpacing(30);
        textFlow.getChildren().addAll(t1, t2, t3,new Button("Button"));

        Text t4 = new Text("包括自己的启蒙老师:著名日本成人*****女优的复出，甚至包括自己周围同事一如既往的表现");
        t4.setFont(Font.font(20));

        TextFlow textFlow2 = new TextFlow();
        textFlow2.setStyle("-fx-background-color:#eecfa1");
        textFlow2.getChildren().addAll(t4);

        an.setTopAnchor(textFlow,100.0);
        an.setLeftAnchor(textFlow,100.0);


        an.getChildren().addAll(textFlow, textFlow2);
        Scene scene = new Scene(an,800,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第20课 TextFlow布局类");
        primaryStage.show();

        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("這是AnchorPane寬度 = "+an.getWidth());
                System.out.println("這是textFloat的寬度 = "+textFlow.getWidth());
                textFlow.setPrefWidth(an.getWidth()-100);
                textFlow2.setPrefWidth(an.getWidth());
            }
        });
    }
}
