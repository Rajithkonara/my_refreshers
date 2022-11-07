package practice;

public class Test2 {

    public static void main(String[] args) {
        String a ="cat";
        String b = "rabbit";

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        int lengthA = charsA.length;
        int lengthB = charsB.length;

        String remaining = "";
        if (lengthA > lengthB) {
            remaining = a.substring(lengthB, lengthA);
        } else {
            remaining = b.substring(lengthA, lengthB);
        }

        StringBuilder stringBuilder = new StringBuilder();

        int min = Math.min(lengthA, lengthB);
        for (int i =0; i < min; i++) {
             stringBuilder.append(charsA[i]);
             stringBuilder.append(charsB[i]);
        }

        System.out.println(stringBuilder.append(remaining));

        System.out.println(remaining);
    }

}
