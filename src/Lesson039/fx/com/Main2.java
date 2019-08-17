//JavaFX视频教程第39课，ComboBox动态添加数据，和关键字搜索
package Lesson039.fx.com;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class Main2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Student s1 = new Student("小A", 18, 90.0);
        Student s2 = new Student("小B", 17, 80.0);
        Student s3 = new Student("小C", 16, 70.0);
        Student s4 = new Student("小D", 15, 60.0);
        Student s5 = new Student("小E", 14, 50.0);

        Button bu = new Button("button");
        ComboBox<Student> cbb = new ComboBox<Student>();
        cbb.getItems().addAll(s1, s2, s3, s4, s5);

        cbb.setEditable(true);
        //cbb.setValue(s1);
        //cbb.setPromptText("請輸入.......");
        //cbb.setPlaceholder(new Button("我是站位的"));
        //cbb.setVisibleRowCount(3);


        cbb.setConverter(new StringConverter<Student>() {
            @Override
            public String toString(Student object) {
                if (object==null) return "";
                String value =null;
                if (object!=null) {
                    value =
                            object.getName() + " - " +
                                    object.getAge() + " - " +
                                    object.getScore();
                }
                if (!cbb.getItems().contains(object)) {
                    cbb.getItems().add(object);
                    System.out.println(object);
                }
                return value;
            }

            @Override
            public Student fromString(String string) {
                if (string.equals("")) return null;
                System.out.println(string);
                Student s = new Student(string, 17, 60.0);
                return s;
            }
        });

        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");
        AnchorPane.setTopAnchor(cbb,100.0);
        AnchorPane.setLeftAnchor(cbb,10.0);
        an.getChildren().addAll(cbb,bu);

        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第39课，ComboBox动态添加数据，和关键字搜索");
        primaryStage.show();
        cbb.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue.intValue());
        });
        cbb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue.getName());
        });
    }
}
