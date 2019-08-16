//JavaFX视频教程第37课，修改ChoiceBox列表的问题，很重要的知识。
package Lesson037.fx.com;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class Main extends Application {
    private Student changeStudent;

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox = new HBox(10);
        TextField tf = new TextField();
        Button bu = new Button("修改名稱");
        hbox.getChildren().addAll(tf, bu);
        Student s1 = new Student("小A", 18, 90.0);
        Student s2 = new Student("小B", 17, 80.0);
        Student s3 = new Student("小C", 16, 70.0);
        Student s4 = new Student("小D", 15, 60.0);
        Student s5 = new Student("小E", 14, 50.0);

        changeStudent = s1;

        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        ChoiceBox<Student> cb = new ChoiceBox<Student>();
        cb.getItems().addAll(s1, s2, s3, s4, s5);

        cb.setConverter(new StringConverter<Student>() {
            @Override
            public String toString(Student object) {
                String value = object.getName() + " - " +
                        object.getAge() + " - " +
                        object.getScore();
                return value;
            }

            @Override
            public Student fromString(String string) {
                return null;
            }
        });


        cb.setPrefWidth(200);
        AnchorPane.setTopAnchor(cb, 100.0);
        AnchorPane.setLeftAnchor(cb, 10.0);
        AnchorPane.setTopAnchor(hbox, 50.0);
        AnchorPane.setLeftAnchor(hbox, 10.0);
        an.getChildren().addAll(cb, hbox);

        Scene scene = new Scene(an, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第37课，修改ChoiceBox列表的问题，很重要的知识。");
        primaryStage.show();

        cb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            changeStudent = newValue;
            tf.setText(changeStudent.getName());
            changeStudent.nameProperty().addListener((observable1, oldValue1, newValue1) -> {
                //System.out.println(newValue1);
                    String name_value = tf.getText();
                    int i=cb.getItems().indexOf(changeStudent);
                    cb.getItems().remove(changeStudent);
                    changeStudent.setName(name_value);
                    cb.getItems().add(i, changeStudent);
            });
        });

        bu.setOnAction(event -> {
            //    String name_value = tf.getText();
            //    int i=cb.getItems().indexOf(changeStudent);
            //    cb.getItems().remove(changeStudent);
            //    changeStudent.setName(name_value);
            //    cb.getItems().add(i, changeStudent);
            String name_value = tf.getText();
            changeStudent.setName(name_value);
        });


    }
}

class Student {
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleIntegerProperty age = new SimpleIntegerProperty();
    private SimpleDoubleProperty score = new SimpleDoubleProperty();

    public Student(String name, int age, Double score) {
        this.name.set(name);
        this.age.set(age);
        this.score.set(score);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public int getAge() {
        return age.get();
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public SimpleIntegerProperty ageProperty() {
        return age;
    }

    public double getScore() {
        return score.get();
    }

    public void setScore(double score) {
        this.score.set(score);
    }

    public SimpleDoubleProperty scoreProperty() {
        return score;
    }
}
