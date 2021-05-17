package edu.game;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Affine;

import java.util.HashMap;


public class View {


    private final Font DEFOL_FONT = new Font(28);

    private Colors colors = new Colors();

    @FXML
    private GridPane gridpane;

    @FXML
    private GridPane scoreBest;

    void updateField(GameField gameField) {
        gridpane.getChildren().clear();


        for (int i = 0; i < 16; i++) {
            int number = gameField.getVale(i);

            Text text = new Text(String.valueOf(number));
            text.setFont(DEFOL_FONT);
            text.setFill(colors.getHumColor(number));

            Rectangle squ = new Rectangle(90, 90, colors.getCellColor(number));

            gridpane.add(new StackPane(squ, text), i / 4, i % 4);
        }

    }
    void updateScore(int curScore, int maxScore) {
        gridpane.getChildren().clear();

    }

//    private Color[] getColors(int num){
//        Color numColor; Color cellColor;
//        if (num <= 4) { numColor = Color.web("#776e65"); } else { numColor = Color.web("#f9f6f2");}
//        switch (num) {
//            case (2): cellColor = Color.web("#eee4da");
//                break;
//            case (4): cellColor = Color.web("#ede0c8");
//                break;
//            case (8): cellColor = Color.web("#f2b179");
//                break;
//            case (16): cellColor = Color.web("#f69659");
//                break;
//            case (32): cellColor = Color.web("#f67c5f");
//                break;
//            case (64): cellColor = Color.web("#f65e3b");
//                break;
//            case (128): cellColor = Color.web("#edce71");
//                break;
//            case (256): cellColor = Color.web("#e9cc64");
//                break;
//            case (512): cellColor = Color.web("#ebc654");
//                break;
//            case (1024): cellColor = Color.web("#edc53f");
//                break;
//            default: cellColor = Color.web("#eec22e");
//                break;
//        }
//        return  new Color[] {numColor, cellColor};
//    }
}
