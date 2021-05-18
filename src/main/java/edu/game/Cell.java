package edu.game;
public class Cell {
    int value;
    int num;

    public Cell(int num) { this.value = 0; this.num = num; }

    public void setValue(int value) { this.value = value; }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
