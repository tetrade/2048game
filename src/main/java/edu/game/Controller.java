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
    void game(ActionEvent ae) { vanishLoseText(); this.startGame(); }

    @FXML
    void keyListener(KeyEvent event) {
        this.makeMove(event.getCode().toString());
    }

    private void makeMove(String dir) {
        if ("asdw".contains(dir.toLowerCase())) {
            boolean a;
            switch (dir) {
                case ("W"):
                    a = model.move("w");
                    break;
                case ("A"):
                    a = model.move("a");
                    break;
                case ("D"):
                    a = model.move("d");
                    break;
                default:
                    a = model.move("s");
                    break;
            }
            updateField(model.gameField);
            updateScore(model.maxvalue, model.record);
            if (!a) {
               getLoseText();
            }
        }
    }


    private void startGame() {
        updateScore(0, model.record);
        model.resetGame();
        updateField(model.gameField);
    }
}

