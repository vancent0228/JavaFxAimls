//JavaFX视频教程第30课，TabPane和Tab切换面板组件
package Lesson030.fx.com;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();

        TabPane tabPane = new TabPane();
        tabPane.setStyle("-fx-background-color:#ffa07a");
        tabPane.setPrefWidth(300);
        tabPane.setPrefHeight(300);
        Tab tab1 = new Tab("tab1");
        Tab tab2 = new Tab("tab2");
        Tab tab3 = new Tab("tab3");
        Tab tab4 = new Tab("tab4");

        HBox hbox = new HBox(10);
        hbox.setStyle("-fx-background-color:#ff69b4");
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(new Button("button1"), new Button("button2"));
        tab1.setContent(hbox);

        VBox vbox = new VBox(10);
        vbox.setStyle("-fx-background-color:#b9d3ee");
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(new Button("button3"), new Button("button4"));
        tab2.setContent(vbox);

        tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);
        AnchorPane.setTopAnchor(tabPane, 100.0);
        AnchorPane.setLeftAnchor(tabPane, 100.0);
        an.getChildren().addAll(tabPane);
        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第30课，TabPane和Tab切换面板组件");

        ImageView img = new ImageView(Main.class.getResource("image.jpg").toString());
        img.setFitWidth(15);
        img.setFitHeight(15);
        tab1.setGraphic(img);
        //tabPane.setSide(Side.RIGHT);

        primaryStage.show();
        //tabPane.setRotateGraphic(false);

        //tab2.setClosable(false);

        //tabPane.getSelectionModel().select(tab2);
        //tabPane.getSelectionModel().selectLast();
        //tabPane.getSelectionModel().selectPrevious();

        //tab2.setDisable(true);

        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        tabPane.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) ->{
            System.out.println(newValue.getText());
        } ));

        tab1.setOnSelectionChanged(event -> {
            Tab t = (Tab)event.getSource();

            System.out.println("這是 = "+t.getText());
        });

    }
}
