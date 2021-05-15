package edu.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {

    public GameField gameField;
    public int record;
    public int maxvalue;
    private final String chars;
    public Model(){ gameField = new GameField(); record = 0; maxvalue = 0; chars = "asdw";}

    // по рандомному номеру ячейки в которой 0
    public void addCell() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++) {
                if (gameField.field[i][j].value == 0) {
                    list.add(gameField.field[i][j].num);
                }
            }
        }
        Random random = new Random();
        int value = 2;
        if (random.nextInt(2) == 1) { value += 2; }
        gameField.setVale(list.get(random.nextInt(list.size())), value);
    }

    private boolean compressCells() {
        boolean hasChanged = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameField.field[i][j].value != 0) {
                    int index = j;
                    while (index > 0) {
                        if (gameField.field[i][index - 1].value == 0) {
                            gameField.field[i][index - 1].value = gameField.field[i][index].value;
                            gameField.field[i][index].value = 0;
                            hasChanged = true;
                        }
                        index--;
                    }
                }
            }
        }
        return hasChanged;
    }

    private boolean mergeCells() {
        boolean hasChanged = false;
        for (int i = 0; i < 4; i ++) {
            for (int j = 1; j < 4; j++) {
                int cell = gameField.field[i][j].value;
                if (cell != 0 && cell == gameField.field[i][j - 1].value) {
                    gameField.field[i][j - 1].value *= 2;
                    gameField.field[i][j].value = 0;
                    hasChanged = true;

                    maxvalue = Math.max(maxvalue, gameField.field[i][j - 1].value);
                    record = Math.max(maxvalue, record);
                }
            }
        }
        compressCells();
        return hasChanged;
    }

    void leftMove() {
        boolean addCell = compressCells() | mergeCells();
        if (addCell) {addCell();}
    }

    void move(String dir){
        rotate(chars.indexOf(dir));
        leftMove();
        rotate((4 - chars.indexOf(dir)) % 4);
    }
    private void rotate(int count) {
        for (int time = 0; time < count; time++) {
            GameField rotation_field = new GameField();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    rotation_field.field[j][3 - i] = gameField.field[i][j];
                }
            }
            gameField = rotation_field;
        }
    }
}
