//JavaFX视频教程第34课，简单实现文本框的关键字查询，和文本排序。
package Lesson034.fx.com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main extends Application {
    int index=0;
    String substr = "";
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField find_tf = new TextField();
        Button find_bu = new Button("查找");
        Button sort_bu = new Button("排序");

        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(find_tf, find_bu, sort_bu);
        hbox.setAlignment(Pos.CENTER);

        TextArea find_ta = new TextArea();
        find_ta.setWrapText(true);
        find_ta.setText("asdfasz456dfatyuzzity456456uizsdfasdfazsdf");
        find_ta.appendText("asdfatyuit43z543546yusdfaszzzdfasdtyuityzuifasdfaityuihjksdfasdfasdfasdf");
        find_ta.setFont(Font.font(16));

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(hbox,find_ta);
        vbox.setPadding(new Insets(10));
        vbox.setPrefWidth(300);



        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        an.getChildren().addAll(vbox);



        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第34课，简单实现文本框的关键字查询，和文本排序。");
        primaryStage.show();

        sort_bu.setOnAction(event -> {
            char[] chararray = find_ta.getText().toCharArray();

            ArrayList<String> list = new ArrayList<String>();

            for (int i = 0; i < chararray.length; i++) {
                list.add(chararray[i]+"");
            }
            find_ta.clear();
            list.stream().sorted((item1,item2) -> item1.compareTo(item2) ).forEach(item->find_ta.appendText(item));
        });
        find_bu.setOnAction(event -> {

            find_ta.getParagraphs().forEach(new Consumer<CharSequence>() {
                @Override
                public void accept(CharSequence charSequence) {
                    String value = charSequence.toString();
                    String find_value = find_tf.getText();

                    substr = value.substring(index);

                    if (substr.contains(find_value)){
                        primaryStage.setTitle("查找成功");
                        int i = substr.indexOf(find_value);
                        int temp = i+index;
                        index = temp +find_value.length();

                        System.out.println(substr+","+temp+","+index);

                        find_ta.selectRange(temp,index);
                        find_ta.requestFocus();
                        return;
                    }

                    primaryStage.setTitle("已經查找完成");
                        substr = value;
                        index = 0;

                }
            });
        });
    }
}
