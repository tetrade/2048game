package edu.game;

public class GameField {

    public Cell[][] field;

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


    public boolean equals(GameField gameField) {
        for (int i = 0; i < 16; i++) {
            if (this.getVale(i) != gameField.getVale(i)) {return false;}
        }
        return true;
    }


    public GameField copy() {
        GameField copy = new GameField();
        for (int i = 0; i < 16; i++) {
            copy.setVale(i, this.getVale(i));
        }
        return copy;
    }

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
