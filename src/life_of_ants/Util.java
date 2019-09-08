package life_of_ants;

public class Util {
    public static int getIntegerBetween(int min, int max) {
        int upperBound = max - min;
        int lowerBound = (int) (Math.random() * (upperBound + 1));
        return lowerBound + min;
    }
}
