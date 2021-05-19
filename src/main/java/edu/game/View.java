package edu.game;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class View {


    private final Font DEFOLT_FONT = Font.font("Arial", FontWeight.BOLD, 28);
    private final Font SCORE_FONT = Font.font("Arial",FontWeight.BOLD,18);

    private Colors colors = new Colors();

    @FXML
    private GridPane gridpane;

    @FXML
    private Text loseText;

    @FXML
    private GridPane scoreBest;


    private void updateField(GameField gameField) {
        gridpane.getChildren().clear();
        for (int i = 0; i < 16; i++) {
            int number = gameField.getVale(i);

            Text text = new Text(String.valueOf(number));
            text.setFont(DEFOLT_FONT);
            text.setFill(colors.getHumColor(number));

            Rectangle squ = new Rectangle(90, 90, colors.getCellColor(number));

            gridpane.add(new StackPane(squ, text), i % 4, i / 4);
        }

    }
    private void updateScore(int curScore, int maxScore) {
        scoreBest.getChildren().clear();

        Text curScoreText = new Text(String.valueOf(curScore));
        Text maxScoreText = new Text(String.valueOf(maxScore));

        curScoreText.setFill(Color.WHITE);
        maxScoreText.setFill(Color.WHITE);

        curScoreText.setFont(SCORE_FONT);
        maxScoreText.setFont(SCORE_FONT);

        scoreBest.add(curScoreText, 0, 0);
        scoreBest.add(maxScoreText, 1, 0);
    }

    void updateView(int curScore, int maxScore, GameField gameField) {
        updateScore(curScore, maxScore);
        updateField(gameField);
    }

    void getLoseText() {
        loseText.setFill(Color.web("#0F0000"));
    }
    void vanishLoseText() {
        loseText.setFill(Color.web("#fbf8ef"));
    }
}
