package first;

public class RailFenceCipherEncoder {
    private static final Integer MINIMUM_RAILS_VALUE = 2;
    private static final String EMPTY_STRING = "";

    public String encode(String message, int rails) {
        if (message.isEmpty() || rails < MINIMUM_RAILS_VALUE) {
            return EMPTY_STRING;
        }
        char[] encryptedMessage = new char[message.length()];
        int n = 0;
        for (int i = 0; i < rails; i++) {
            int index = i;
            boolean goingDown = true;
            while (index < message.length()) {
                encryptedMessage[n++] = message.charAt(index);
                if (i == 0 || i == rails - 1) {
                    index = index + 2 * (rails - 1);
                } else if (goingDown) {
                    index = index + 2 * (rails - i - 1);
                    goingDown = !goingDown;
                } else {
                    index = index + 2 * i;
                    goingDown = !goingDown;
                }
            }
        }
        return new String(encryptedMessage);
    }

    public String decode(String message, int rails) {
        if (message.isEmpty() || rails < MINIMUM_RAILS_VALUE) {
            return EMPTY_STRING;
        }
        char[] decryptedMessage = new char[message.length()];
        int n = 0;
        for (int i = 0; i < rails; i++) {
            int index = i;
            boolean goingDown = true;
            while (index < message.length()) {
                decryptedMessage[index] = message.charAt(n++);
                if (i == 0 || i == rails - 1) {
                    index = index + 2 * (rails - 1);
                } else if (goingDown) {
                    index = index + 2 * (rails - i - 1);
                    goingDown = !goingDown;
                } else {
                    index = index + 2 * i;
                    goingDown = !goingDown;
                }
            }
        }
        return new String(decryptedMessage);
    }
}
