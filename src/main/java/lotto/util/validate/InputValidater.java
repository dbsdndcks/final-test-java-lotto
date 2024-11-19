package lotto.util.validate;

public class InputValidater {
    public static void validateInputMoney(String purchaseMoney) {
        validateEmpty(purchaseMoney;
        validateNumeric(purchaseMoney);
        validateUnitOfMoney(purchaseMoney);
    }

    private static void validateUnitOfMoney(String purchaseMoney) {
        if (purchaseMoney.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateNumeric(String purchaseMoney) {
        if (purchaseMoney.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateEmpty(String purchaseMoney) {
        if (Integer.parseInt(purchaseMoney) % 1000 != 0) {
            throw new IllegalArgumentException();
        }
    }
}
