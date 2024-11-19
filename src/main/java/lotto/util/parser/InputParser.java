package lotto.util.parser;

public class InputParser {
    public static int stringToNumberPaser(String input) {
        int money = 0;
        try {
            money = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException();
        }
        return money;
    }
}
