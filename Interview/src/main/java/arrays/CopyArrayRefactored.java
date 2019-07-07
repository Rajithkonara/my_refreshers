package arrays;

import java.util.logging.Logger;

public class CopyArrayRefactored {

    private static final Logger logger = Logger.getLogger(CopyArray.class.getName());

    public static void main(String[] args) {

        String[] clubs = {"Bayern München", "Real Madrid", "Manchester City"};
        clubs = addElement(clubs, "FC Barcelona");
        for (String elements :
                clubs) {
            logger.info(elements);
        }

    }

    public static String[] addElement(String[] originalArray, String newItem) {

        int currentSize = originalArray.length;
        int newSize = currentSize + 1;
        String[] tempArr = new String[newSize];

        for (int i = 0; i < currentSize; i++) {
            tempArr[i] = originalArray[i];
        }
        tempArr[newSize-1] = newItem;
        return tempArr;
    }

}
