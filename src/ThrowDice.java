import java.util.Random;

public class ThrowDice {
    static Random random = new Random();

    public static int DiceValue() {
        int terning = random.nextInt(6) + 1;
        return terning;
    }

    public static int DiceValueMultipleTwo() {
        return DiceValue() * 2;
    }
}
