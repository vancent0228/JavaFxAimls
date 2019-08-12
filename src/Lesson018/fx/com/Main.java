//JavaFX视频教程第18课 GridPane布局类
package Lesson018.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button1");
        Button b2 = new Button("button2");
        Button b3 = new Button("button3");
        Button b4 = new Button("button4");
        Button b5 = new Button("button5");
        Button b6 = new Button("button6");
        Button b7 = new Button("button7");
        Button b8 = new Button("button8");

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:#ee6aa7");

        // 設置組件在GridPane里的第幾列第幾行
        grid.add(b1,0,0);
        grid.add(b2,1,0);
        grid.add(b3,2,0);
        grid.add(b4,3,0);
        grid.add(b5,0,1);
        grid.add(b6,1,1);
        grid.add(b7,2,1);
        grid.add(b8,3,1);

        //grid.setPadding(new Insets(10));
        grid.setAlignment(Pos.TOP_CENTER);
        //grid.setHgap(5);
        //grid.setVgap(5);
        //grid.setMargin(b5,new Insets(50));

        //手動設定 第一種
        //grid.setConstraints(b1,1,1);
        //grid.getChildren().addAll(b1);

        //手動設定 第二種
        //grid.setRowIndex(b1,0);
        //grid.setColumnIndex(b1,1);
        //grid.getChildren().add(b1);

        grid.getColumnConstraints().add(new ColumnConstraints(100));//第一列間距
        grid.getColumnConstraints().add(new ColumnConstraints(100));//第二列間距
        grid.getRowConstraints().add(new RowConstraints(50));//第一行間距

        Scene scene = new Scene(grid,800,800);

        primaryStage.setScene(scene);

        primaryStage.setTitle("JavaFX视频教程第18课 GridPane布局类");
        primaryStage.show();
    }
}
