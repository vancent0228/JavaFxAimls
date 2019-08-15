//JavaFX视频教程第33课，关于文本框限制用户输入格式的问题
package Lesson033.fx.com;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.util.function.UnaryOperator;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(20);
        TextField tf = new TextField();
        TextArea ta = new TextArea();
        ta.setText("ABCDEF");
        box.getChildren().addAll(tf, ta);
        box.setAlignment(Pos.CENTER);

        //tf.setTextFormatter(new TextFormatter<String>(new UnaryOperator<TextFormatter.Change>() {
        //    @Override
        //    public TextFormatter.Change apply(TextFormatter.Change change) {
        //        System.out.println(change.getText());
        //        String value = change.getText();
        //        //if (value.matches("[a-z]*"))
        //        //{
        //        //    return change;
        //        //}
        //        if (value.matches("[0-9]*"))
        //        {
        //            return change;
        //        }
        //        return null;
        //    }
        //}));

        Scene scene = new Scene(box, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第33课，关于文本框限制用户输入格式的问题");
        primaryStage.show();

        ta.textProperty().addListener((observable, oldValue, newValue) -> {
            ta.setTextFormatter(new TextFormatter<String>(new StringConverter<String>() {
                @Override
                public String toString(String object) {
                    System.out.println("obj="+object);
                    return object;
                }

                @Override
                public String fromString(String string) {
                    System.out.println("str="+string);
                    if (string.contains("5")){
                        String value = string.replace("5", "五");
                        return value;
                    }
                    return string;
                }
            }));
            ta.commitValue();
        });

        //get force
        ta.requestFocus();
    }

}
