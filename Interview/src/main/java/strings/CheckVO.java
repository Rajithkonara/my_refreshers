package strings;

public class CheckVO {


    public static void main(String[] args) {

        String input = "akon";
        System.out.println(noOfVowels(input));

    }

    static int noOfVowels(String name) {
        int count = 0;
        String vowels = "aeiou";
        String normalized = (name.toLowerCase()).trim();
        char[] chars = normalized.toCharArray();


        for (char c : chars) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

}
