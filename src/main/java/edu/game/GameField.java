package edu.game;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class GameField {

    public Cell[][] field;
    public HashMap<Integer, String> colors;

    public GameField() {
       field = new Cell[4][4];
       int num = 0;
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               field[i][j] = new Cell(num);
                num ++;
           }
       }
    }

    public void setVale(int num, int value) {
        field[num / 4][num % 4].setValue(value);
    }
    public int getVale(int num) { return field[num / 4][num % 4].value; }



    public void clearField() {
        field = new Cell[4][4];
        int num = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                field[i][j] = new Cell(num);
                num ++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               string.append(field[i][j].toString()).append(" ");
           }
           string.append("\n");
       }
       return string.toString();
    }
}
