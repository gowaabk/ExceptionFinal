package Data;

public class CheckData {
    public static final int numberOfSpace = 5;

    public static int dataIsValid(String inputData) {

        int spaceCounter = 0;

        for (int i = 0; i < inputData.length(); i++) {
            if (inputData.charAt(i) == ' ') {
                spaceCounter++;
            }
        }

        if (spaceCounter != numberOfSpace) {
            return -1;
        }

        return -100;
    }
}