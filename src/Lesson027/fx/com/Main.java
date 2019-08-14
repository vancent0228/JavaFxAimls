//JavaFX视频教程第27课，菜单栏多选，单选，分隔符，子菜单

package Lesson027.fx.com;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane an = new AnchorPane();
        an.setStyle("-fx-background-color:#ffffff");

        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("menu1");
        Menu menu2 = new Menu("menu2");
        Menu menu3 = new Menu("menu3");
        Menu menu4 = new Menu("menu4");

        SeparatorMenuItem separ1 = new SeparatorMenuItem();
        SeparatorMenuItem separ2 = new SeparatorMenuItem();

        MenuItem item1 = new MenuItem("MenuItem1");
        MenuItem item2 = new MenuItem("MenuItem2");
        MenuItem item3 = new MenuItem("MenuItem3");
        MenuItem item4 = new MenuItem("MenuItem4");
        Menu m = new Menu("MenuItem5");
        MenuItem item5 = new MenuItem("MenuItem5");
        MenuItem item6 = new MenuItem("MenuItem6");
        m.getItems().addAll(item5, item6);

        item1.setDisable(true);
        //menu1.setDisable(true);
        item2.setVisible(false);

        ToggleGroup tg = new ToggleGroup();
        RadioMenuItem rmi1 = new RadioMenuItem("RadioMenuItem1");
        RadioMenuItem rmi2 = new RadioMenuItem("RadioMenuItem2");
        RadioMenuItem rmi3 = new RadioMenuItem("RadioMenuItem3");
        rmi1.setToggleGroup(tg);
        rmi2.setToggleGroup(tg);
        rmi3.setToggleGroup(tg);

        rmi1.setOnAction(event -> {
            //RadioMenuItem r = (RadioMenuItem)event.getSource();
            //System.out.println(r.isSelected());
            System.out.println("rmi1 = "+rmi1.isSelected());
            System.out.println("rmi2 = "+rmi2.isSelected());
            System.out.println("rmi3 = "+rmi3.isSelected());
        });
        rmi2.setOnAction(event -> {
            System.out.println("rmi1 = "+rmi1.isSelected());
            System.out.println("rmi2 = "+rmi2.isSelected());
            System.out.println("rmi3 = "+rmi3.isSelected());
        });
        rmi3.setOnAction(event -> {
            System.out.println("rmi1 = "+rmi1.isSelected());
            System.out.println("rmi2 = "+rmi2.isSelected());
            System.out.println("rmi3 = "+rmi3.isSelected());
        });

        CheckMenuItem cmi1 = new CheckMenuItem("checkMenuItem1");
        CheckMenuItem cmi2 = new CheckMenuItem("checkMenuItem2");
        CheckMenuItem cmi3 = new CheckMenuItem("checkMenuItem3");
        cmi1.setOnAction(event -> {
            System.out.println("cmi1 = "+cmi1.isSelected());
            System.out.println("cmi2 = "+cmi2.isSelected());
            System.out.println("cmi3 = "+cmi3.isSelected());
        });
        cmi2.setOnAction(event -> {
            System.out.println("cmi1 = "+cmi1.isSelected());
            System.out.println("cmi2 = "+cmi2.isSelected());
            System.out.println("cmi3 = "+cmi3.isSelected());
        });
        cmi3.setOnAction(event -> {
            System.out.println("cmi1 = "+cmi1.isSelected());
            System.out.println("cmi2 = "+cmi2.isSelected());
            System.out.println("cmi3 = "+cmi3.isSelected());
        });

        menu1.getItems().addAll(item1,separ1,item2,separ2,item3,item4,m);
        menu2.getItems().addAll(rmi1,rmi2,rmi3);
        menu3.getItems().addAll(cmi1,cmi2,cmi3);

        menuBar.getMenus().addAll(menu1, menu2, menu3, menu4);

        an.getChildren().add(menuBar);

        Scene scene = new Scene(an);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX视频教程第27课，菜单栏多选，单选，分隔符，子菜单");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        menuBar.setPrefWidth(primaryStage.getWidth());
        an.widthProperty().addListener(event -> {
            menuBar.setPrefWidth(primaryStage.getWidth());
        });
    }
}
