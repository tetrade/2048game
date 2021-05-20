import edu.game.GameField;
import edu.game.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    @Test
    public void checkMove1() {
        Model testModel = new Model();
        int[] valList = {
                2, 2, 2, 2,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0
        };
        for (int i = 0; i < 16; i++) {
            testModel.gameField.setVale(i, valList[i]);
        }
        testModel.moveNotAdd("s");
        assertEquals(
                "0 0 0 0\n0 0 0 0\n0 0 0 0\n2 2 2 2",
                testModel.gameField.toString()
        );
    }

    @Test
    public void checkMove2() {
        Model testModel = new Model();
        int[] valList = {
                2, 2, 0, 0,
                0, 0, 2, 0,
                0, 2, 0, 0,
                0, 0, 0, 2
        };
        for (int i = 0; i < 16; i++) {
            testModel.gameField.setVale(i, valList[i]);
        }
        testModel.moveNotAdd("w");
        assertEquals(
                "2 4 2 2\n0 0 0 0\n0 0 0 0\n0 0 0 0",
                testModel.gameField.toString()
        );
    }

    @Test
    public void checkMove3() {
        Model testModel = new Model();
        int[] valList = {
                2, 2, 0, 2,
                0, 0, 2, 2,
                0, 0, 4, 2,
                0, 4, 0, 2
        };
        for (int i = 0; i < 16; i++) {
            testModel.gameField.setVale(i, valList[i]);
        }

        testModel.moveNotAdd("w");
        testModel.moveNotAdd("d");

        assertEquals(
                "0 2 4 4\n0 0 4 8\n0 0 0 0\n0 0 0 0",
                testModel.gameField.toString()
        );
    }

    @Test
    public void checkMove4() {
        Model testModel = new Model();
        int[] valList = {
                8, 0, 0, 2,
                32, 32, 32, 32,
                2, 0, 4, 64,
                0, 4, 0, 2
        };
        for (int i = 0; i < 16; i++) { testModel.gameField.setVale(i, valList[i]); }
        testModel.moveNotAdd("d");
        testModel.moveNotAdd("s");
        testModel.moveNotAdd("a");
        testModel.moveNotAdd("w");
        assertEquals(
                "8 2 2 0\n64 128 0 0\n2 8 0 0\n0 0 0 0",
                testModel.gameField.toString()
        );
    }

    @Test
    public void checkExistMove1() {
        Model testModel = new Model();
        int[] valList = {
                8, 2, 4, 2,
                32, 32, 32, 32,
                2, 2, 4, 64,
                2, 4, 8, 2
        };
        for (int i = 0; i < 16; i++) { testModel.gameField.setVale(i, valList[i]); }
        assertTrue(testModel.moveExist());
    }

    @Test
    public void checkExistMove2() {
        Model testModel = new Model();
        int[] valList = {
                8, 2, 4, 2,
                128, 32, 256, 32,
                4, 8, 4, 64,
                2, 4, 8, 2
        };
        for (int i = 0; i < 16; i++) { testModel.gameField.setVale(i, valList[i]); }
        assertFalse(testModel.moveExist());
    }

    @Test
    public void checkExistMove3() {
        Model testModel = new Model();
        int[] valList = {
                8, 2, 4, 2,
                128, 0, 256, 32,
                4, 8, 4, 64,
                2, 4, 8, 2
        };
        for (int i = 0; i < 16; i++) { testModel.gameField.setVale(i, valList[i]); }
        assertTrue(testModel.moveExist());
    }
}
