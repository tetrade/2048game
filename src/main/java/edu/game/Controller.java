package edu.game;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
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
    void game(ActionEvent ae) { this.startGame(); }

    @FXML
    void keyListener(KeyEvent event) {
        String dir = event.getCode().toString().toLowerCase();
        if ("asdw".contains(dir)) { this.makeMove(dir); };
    }

    private void makeMove(String dir) {
        if (!model.move(dir)) { getLoseText(); }
        updateView(model.maxvalue, model.record, model.gameField);
    }

    private void startGame() {
        model.resetGame();
        vanishLoseText();
        updateView(model.maxvalue, model.record, model.gameField);
    }
}

