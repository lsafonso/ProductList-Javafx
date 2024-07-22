package org.example.onlinepaymenapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class OnlinePaymentApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OnlinePaymentApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        scene.getStylesheets().add(getClass().getResource("/org/example/onlinepaymenapp/style.css").toExternalForm());

        // Set up the stage
        stage.setTitle("Online Payment App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
