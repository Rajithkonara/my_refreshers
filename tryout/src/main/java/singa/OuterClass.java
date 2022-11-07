package singa;


import org.jetbrains.annotations.NotNull;

public class OuterClass {

    public static void main(String[] args) {

        String[] strings = {"f", "o","o", "bar"};

        String stringBuilder = getStringBuilder(strings);


        System.out.println(stringBuilder.toString());
    }

    @NotNull
    private static String getStringBuilder(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}
