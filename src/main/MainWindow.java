package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

public class MainWindow extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader root = new FXMLLoader(getClass().getResource("MainWindowInterface.fxml"));
        stage.setTitle("Számológép");
        Scene scene = new Scene(root.load());
        stage.setScene(scene);
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        ((MainWindowController)root.getController()).init(stage);
        stage.show();
    }
    public void run() {
        launch();
    }
}
