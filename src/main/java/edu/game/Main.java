package edu.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        primaryStage.getIcons().add(new Image("file:src/main/resources/edu/game/2048.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("2048");
        primaryStage.show();

    }
}
