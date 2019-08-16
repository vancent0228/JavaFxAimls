//JavaFX视频教程第36课，ChoiceBox的使用和加载对象类型数据，以及数据源排序
package Lesson036.fx.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
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


        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        ChoiceBox<Student> cb = new ChoiceBox<Student>();
        cb.getItems().addAll(s1, s2, s3, s4, s5);

        cb.setConverter(new StringConverter<Student>() {
            @Override
            public String toString(Student object) {
                String value= object.getName()+" - "+
                        object.getAge()+" - "+
                        object.getScore();
                return value;
            }

            @Override
            public Student fromString(String string) {
                return null;
            }
        });


        cb.setPrefWidth(100);
        AnchorPane.setTopAnchor(cb,100.0);
        AnchorPane.setLeftAnchor(cb,10.0);
        an.getChildren().addAll(cb);

        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第36课，ChoiceBox的使用和加载对象类型数据，以及数据源排序");
        primaryStage.show();
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
