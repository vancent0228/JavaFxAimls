//使用Application.launch(xxxx.class,xxxx)執行 繼承 Application 的 Class
package Lesson002.fx.com;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main3 {
    public static void main(String[] args) {
        Application.launch(Launch.class, args);
    }
}
