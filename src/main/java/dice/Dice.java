package dice;

import java.util.Random;

public class Dice {
    private Random random;

    public Dice() {
        random = new Random();
    }

    public int roll(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        return random.nextInt(sides) + 1;
    }
}
