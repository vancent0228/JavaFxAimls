//JavaFX视频教程第29课，Accordion和TitledPane可折叠组件
package Lesson029.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();

        Accordion acc = new Accordion();


        TitledPane tp1 = new TitledPane("TitledPane1", new Button("Button1",new Button("image")));
        TitledPane tp2 = new TitledPane();
        tp2.setText("TitledPane2");
        tp2.setContent(new Button("Button2"));

        TitledPane tp3 = new TitledPane();
        tp3.setText("TitledPane3");
        HBox box = new HBox();
        box.setStyle("-fx-background-color:#fff68f");
        box.setSpacing(10);
        box.getChildren().addAll(new Button("Button3"), new Button("Button4"), new Button("Button5"));
        tp3.setContent(box);
        tp3.setGraphic(new Button("image"));

        //AnchorPane.setTopAnchor(tp2,200.0);
        //AnchorPane.setTopAnchor(tp3,400.0);
        //an.getChildren().addAll(tp1,tp2,tp3);

        //tp1.setAnimated(false);
        //tp1.setCollapsible(false);
        //tp1.setExpanded(false);

        acc.getPanes().addAll(tp1, tp2, tp3);
        an.getChildren().add(acc);
        Scene scene = new Scene(an);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第29课，Accordion和TitledPane可折叠组件");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        tp1.expandedProperty().addListener(event->{

            System.out.println(tp1.isExpanded());
        });

        acc.expandedPaneProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue==null) {
                System.out.println(oldValue.getText()+"折叠");
            }else
            {
                System.out.println(newValue.getText()+"展開");
            }
        });
    }
}
