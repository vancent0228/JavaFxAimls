//JavaFX视频教程第36课，ChoiceBox的使用和加载对象类型数据，以及数据源排序
package Lesson036.fx.com;

import javafx.application.Application;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Comparator;

public class Main3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //SimpleListProperty<String> slp = new SimpleListProperty<String>();
        Button bu = new Button("排序");

        ObservableList<String> list1 = FXCollections.observableArrayList();
        list1.addAll("數字", "字母");
        ObservableList<String> list2 = FXCollections.observableArrayList();
        list2.addAll("1","2","3","4","5","6");
        ObservableList<String> list3 = FXCollections.observableArrayList();
        list3.addAll("A","B","C","D","E");
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        ChoiceBox<String> cb1 = new ChoiceBox<String>();
        cb1.setItems(list1);
        ChoiceBox<String> cb2 = new ChoiceBox<String>();

        cb1.setPrefWidth(180);
        cb2.setPrefWidth(180);
        AnchorPane.setTopAnchor(cb1,100.0);
        AnchorPane.setLeftAnchor(cb1,10.0);
        AnchorPane.setTopAnchor(cb2,100.0);
        AnchorPane.setLeftAnchor(cb2,200.0);
        an.getChildren().addAll(cb1, cb2,bu);
        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第36课，ChoiceBox的使用和加载对象类型数据，以及数据源排序");
        primaryStage.show();

        cb1.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("數字")) {
                cb2.setItems(list2);
            }else if (newValue.equals("字母")){
                cb2.setItems(list3);
            }
            cb2.show();
        });

        bu.setOnAction(event -> {
            list2.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int i1 = Integer.valueOf(o1);
                    int i2 = Integer.valueOf(o2);

                    return i2-i1;
                }
            });
        });
    }
}