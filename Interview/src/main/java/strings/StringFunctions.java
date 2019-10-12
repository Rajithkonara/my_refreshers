package strings;

public class StringFunctions {

    public static void main(String[] args) {
        String a = "Apples";
        String b = "Bananas";
        String c = "Oranges";
        String d = "Banana Peels";
        String e = "Pears";

        String[] fruits = {a, b, c ,d, e};

        for (String f: fruits) {

            int index = 1;
            System.out.print(f.charAt(index));

            char[] charArray = f.toCharArray();
            System.out.println("Char at " + index + ":" + charArray[index]);

            int indexE = f.indexOf('e');
            System.out.println(indexE);
        }
    }

}
