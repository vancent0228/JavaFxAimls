//JavaFX视频教程第38课，ComboBox的基本使用
package Lesson038.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
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
                String value =null;
                if (object!=null) {
                    value =
                            object.getName() + " - " +
                                    object.getAge() + " - " +
                                    object.getScore();
                }
                return value;
            }

            @Override
            public Student fromString(String string) {
                System.out.println(string);
                return null;
            }
        });

        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");
        AnchorPane.setTopAnchor(cbb,100.0);
        AnchorPane.setLeftAnchor(cbb,10.0);
        an.getChildren().addAll(cbb,bu);

        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第38课，ComboBox的基本使用");
        primaryStage.show();
        cbb.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue.intValue());
        });
        cbb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue.getName());
        });
    }
}
class Student {
    private  String name;
    private  int age;
    private  Double score;

    public Student(String name, int age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
