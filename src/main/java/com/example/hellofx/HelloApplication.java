package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.net.URL;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxml = getClass().getResource("/com/example/hellofx/hello-view.fxml");
        System.out.println("FXML URL: " + fxml);
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/hellofx/hello-view.fxml"));
        primaryStage.setTitle("News Aggressor Detector");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        

    }

    public static void main(String[] args) {
        launch(args);
    }
}