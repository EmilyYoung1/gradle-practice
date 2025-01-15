package dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
  
    @Test
    public void checkDiceInRange() {
        Dice dice = new Dice();
        int sides = 6;

        for (int i = 0; i < 100; i++) {
            int rollResult = dice.roll(sides);

            assertTrue(rollResult >= 1 && rollResult <= sides, 
                "The roll result " + rollResult + " is out of range (1 to " + sides + ")");
        }
    }
}
