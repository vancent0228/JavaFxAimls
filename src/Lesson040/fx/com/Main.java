//JavaFX视频教程第40课，javafx中的setCellFactory方法解析，自定义单元格
package Lesson040.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        ComboBox<String> cbb = new ComboBox<String>();
        cbb.getItems().addAll("str1", "str2", "str3");

        cbb.setConverter(new StringConverter<String>() {
            @Override
            public String toString(String object) {
                //System.out.println(object);
                return object;
            }

            @Override
            public String fromString(String string) {
                return null;
            }
        });

        cbb.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> param) {
                ListCell<String> listCell = new ListCell<String>();
                param.getItems().forEach(System.out::println);
                return listCell;
            }
        });


        cbb.setPrefWidth(150);
        AnchorPane.setTopAnchor(cbb,100.0);
        AnchorPane.setLeftAnchor(cbb,20.0);
        an.getChildren().addAll(cbb);
        Scene scene = new Scene(an,800,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第40课，javafx中的setCellFactory方法解析，自定义单元格");
        primaryStage.show();
    }
}
