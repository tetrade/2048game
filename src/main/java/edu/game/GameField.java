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

    public boolean emptyStr(int index){
        int s = 0;
        for (int j = 0; j < 4; j++) {
            s += field[index][j].value;
        }
        return s != 0;
    }

    public void setVale(int num, int value) {
        field[num / 4][num % 4].setValue(value);
    }

    public void setValue(int x, int y, int value) {
        field[x][y].setValue(value);
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
