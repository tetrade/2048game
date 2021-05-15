package edu.game;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

import java.awt.Robot;
import java.awt.event.InputEvent;

import java.io.IOException;
import java.util.Arrays;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("2048 game");
        Scene scene = new Scene(root, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        Model game = new Model();
        game.addCell();
        game.addCell();
        System.out.println(game.gameField);
        game.move("a");
        System.out.println(game.gameField);
        game.move("s");
        System.out.println(game.gameField);
        game.move("d");
        System.out.println(game.gameField);
        game.move("w");
        System.out.println(game.gameField);




//        scene.setOnKeyTyped(ke -> {
//            System.out.println(ke.getCharacter());
//        });


    }
}
