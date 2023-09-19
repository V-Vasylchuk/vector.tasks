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
            int step = i == 0 || i == rails - 1 ? 2 * (rails - 1) : 0;
            boolean goingDown = true;
            while (index < message.length()) {
                encryptedMessage[n++] = message.charAt(index);
                if (step == 0) {
                    step = goingDown ? 2 * (rails - i - 1) : 2 * i;
                    goingDown = !goingDown;
                }
                index += step;
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
            int step = i == 0 || i == rails - 1 ? 2 * (rails - 1) : 0;
            boolean goingDown = true;
            while (index < message.length()) {
                decryptedMessage[index] = message.charAt(n++);
                if (step == 0) {
                    step = goingDown ? 2 * (rails - i - 1) : 2 * i;
                    goingDown = !goingDown;
                }
                index += step;
            }
        }
        return new String(decryptedMessage);
    }
}
