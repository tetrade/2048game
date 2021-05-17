package edu.game;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.net.URL;
import java.time.format.TextStyle;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Controller extends View implements Initializable {
    private Model model = new Model();

    @FXML
    private ResourceBundle resource;

    @FXML
    private URL location;

    @FXML
    private GridPane scoreBest;

    @FXML
    public GridPane gridpane;

    @FXML
    private Text text;

    @FXML
    private Button restart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.startGame();
    }

    @FXML
    void game(ActionEvent ae){
        this.startGame();
    }

    @FXML
    void keyListener(KeyEvent event) {
       this.makeMove(event.getCode().toString());
    }

    private void makeMove(String dir){
        switch (dir) {
            case("W"): model.move("w");
                break;
            case("A"): model.move("a");
                break;
            case("D"): model.move("d");
                break;
            case("S"): model.move("s");
        }
        updateField(model.gameField);
    }

    private void startGame() {
        model.resetGame();
        updateField(model.gameField);
    }
}

