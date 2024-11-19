package lotto.util.validate;


public class InputValidater {

    private final static String NUMERIC_PATTERN = "^[0-9]*$";

    public static void validateInputMoney(String purchaseMoney) {
        validateEmpty(purchaseMoney);
        validateNumeric(purchaseMoney);
        validateUnitOfMoney(purchaseMoney);
    }

    private static void validateEmpty(String purchaseMoney) {
        if (purchaseMoney.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
    private static void validateNumeric(String purchaseMoney) {
        if (!purchaseMoney.matches(NUMERIC_PATTERN)) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateUnitOfMoney(String purchaseMoney) {
        int money = Integer.parseInt(purchaseMoney);
        if (money % 1000 != 0) {
            throw new IllegalArgumentException();
        }
    }
}
