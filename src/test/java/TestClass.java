import edu.game.GameField;
import edu.game.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    @Test
    public void check1() {
        Model testModel = new Model();

        testModel.gameField.setVale(0, 2);
        testModel.gameField.setVale(1, 2);
        testModel.gameField.setVale(2, 2);
        testModel.gameField.setVale(3, 2);
        testModel.gameField.setVale(4, 0);
        testModel.gameField.setVale(5, 0);
        testModel.gameField.setVale(6, 0);
        testModel.gameField.setVale(7, 0);
        testModel.gameField.setVale(8, 0);
        testModel.gameField.setVale(9, 0);
        testModel.gameField.setVale(10, 0);
        testModel.gameField.setVale(11, 0);
        testModel.gameField.setVale(12, 0);
        testModel.gameField.setVale(13, 0);
        testModel.gameField.setVale(14, 0);
        testModel.gameField.setVale(15, 0);

        testModel.moveNotAdd("s");

        assertEquals(
                "0 0 0 0\n0 0 0 0\n0 0 0 0\n2 2 2 2",
                testModel.gameField.toString()
        );
    }

    @Test
    public void check2() {
        Model testModel = new Model();

        testModel.gameField.setVale(0, 2);
        testModel.gameField.setVale(1, 2);
        testModel.gameField.setVale(2, 0);
        testModel.gameField.setVale(3, 0);
        testModel.gameField.setVale(4, 0);
        testModel.gameField.setVale(5, 2);
        testModel.gameField.setVale(6, 0);
        testModel.gameField.setVale(7, 0);
        testModel.gameField.setVale(8, 0);
        testModel.gameField.setVale(9, 0);
        testModel.gameField.setVale(10, 2);
        testModel.gameField.setVale(11, 0);
        testModel.gameField.setVale(12, 0);
        testModel.gameField.setVale(13, 0);
        testModel.gameField.setVale(14, 0);
        testModel.gameField.setVale(15, 2);

        testModel.moveNotAdd("w");

        assertEquals(
                "2 4 2 2\n0 0 0 0\n0 0 0 0\n0 0 0 0",
                testModel.gameField.toString()
        );
    }
}
