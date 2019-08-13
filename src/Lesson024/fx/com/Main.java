//JavaFX视频教程第24课，制作简单的登录窗口，以及几个小知识点
package Lesson024.fx.com;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gr= new GridPane();

        Label l_name = new Label("  帳號:");
        l_name.setFont(Font.font(20));
        Label l_password = new Label("  密碼:");
        l_password.setFont(Font.font(20));

        TextField t_name = new TextField();
        t_name.setUserData("1234");
        t_name.setFont(Font.font(20));
        t_name.setTooltip(new Tooltip("請輸入用戶名"));
        PasswordField t_password = new PasswordField();
        t_password.setUserData(1234);
        t_password.setFont(Font.font(20));
        t_password.setTooltip(new Tooltip("請輸入用戶密碼"));

        Button login = new Button("登錄");
        login.setFont(Font.font(20));
        login.setPrefWidth(100);
        login.setOnAction(e->{
            String name=(String)t_name.getUserData();
            int password=(int)t_password.getUserData();


            if (t_name.getText().equals(name)&&password==Integer.valueOf(t_password.getText())){
                System.out.println("登錄成功");
                new MyWindow(name,password+"");
                primaryStage.close();
            }else{
                System.out.println("登錄失敗");
                primaryStage.setTitle("帳號或密碼錯誤");

                FadeTransition fade = new FadeTransition();
                fade.setDuration(Duration.seconds(0.5));
                fade.setNode(gr);
                fade.setFromValue(0);
                fade.setToValue(1);
                fade.play();


            }
        });


        Button clear = new Button("清除");
        clear.setFont(Font.font(20));
        clear.setPrefWidth(100);
        clear.setOnAction(event -> {
            t_name.setText("");
            t_password.setText("");
        });

        gr.setStyle("-fx-background-color:#00BFFF");
        gr.setAlignment(Pos.CENTER);
        gr.setHgap(5);
        gr.setVgap(17);
        gr.setMargin(login,new Insets(0,0,0,50));
        gr.add(l_name, 0, 0);
        gr.add(t_name, 1, 0);

        gr.add(l_password, 0, 1);
        gr.add(t_password, 1, 1);

        gr.add(clear, 0, 2);
        gr.add(login, 1, 2);

        Scene scene = new Scene(gr);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第24课，制作简单的登录窗口，以及几个小知识点");
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}

class MyWindow {
    private final Stage stage= new Stage();
    public MyWindow(String name,String password) {
        Text text = new Text("帳號:　"+name+" 密碼: "+password);
        BorderPane bor = new BorderPane();
        bor.setStyle("-fx-background-color:#DDA0DD");
        bor.setCenter(text);
        Scene scene = new Scene(bor);
        stage.setScene(scene);
        stage.setTitle("登錄成功");
        stage.setHeight(500);
        stage.setWidth(500);
        stage.show();
    }
}
