package edu.game;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class Colors {

    public HashMap<Integer, String> COLOR_CELL;

    public Colors() {
        COLOR_CELL = new HashMap<>();
        COLOR_CELL.put(0, "#cdc0b4");
        COLOR_CELL.put(2, "#eee4da");
        COLOR_CELL.put(4, "#ede0c8");
        COLOR_CELL.put(8, "#ede0c8");
        COLOR_CELL.put(16, "#f2b179");
        COLOR_CELL.put(32, "#f69659");
        COLOR_CELL.put(64, "#f67c5f");
        COLOR_CELL.put(128, "#edce71");
        COLOR_CELL.put(256, "#e9cc64");
        COLOR_CELL.put(512, "#ebc654");
        COLOR_CELL.put(1024, "#edc53f");
        COLOR_CELL.put(2048, "#eec22e");
    }

    public Color getCellColor(int num) {
        return Color.web(COLOR_CELL.get(num));
    }

    public Color getHumColor(int num) {
        if (num == 0) { return Color.web("#cdc0b4"); }
        if (num <= 4) { return Color.web("#776e65"); }
        return Color.web("#f9f6f2");
    }
}
