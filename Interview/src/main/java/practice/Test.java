package practice;

import java.util.ArrayList;

/**
 * Created by rajith on 1/13/19.
 */
public class Test {

    public static void main(String[] args) {


        int value = 7;
        value = calculate(7);
        System.out.println(value);


        ArrayList<String> msisdns = new ArrayList<>(5);

        msisdns.add("93373524301");
        msisdns.add("93373524300");

        for (String cur: msisdns) {
                if (isBlacklisted(cur)) {
                    System.out.println("Blacklisted Number: " +cur);
                    System.err.println("blacklisted");
                    break;
                }
        }

        System.out.println(msisdns);
    }


    static boolean isBlacklisted(String msisdn) {
        return msisdn.equals("93373524303");
    }

    static int calculate(int data) {
        int tempValue = data + 3;
        int newValue = tempValue * 2;
        return newValue;
    }

}
