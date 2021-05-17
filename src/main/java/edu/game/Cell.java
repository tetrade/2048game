package edu.game;

import javafx.scene.paint.Color;

public class Cell {
    int value = 0;
    int num;
    Color color;

    public Cell(int num, int value) { this.value = value; this.num = num; }
    public Cell(int num) { this.value = 0; this.num = num; }


    public void setValue(int value) { this.value = value; }
    public boolean isEmpty() { return this.value == 0;}

    @Override
    public String toString(){
        return String.valueOf(value);
    }


}
