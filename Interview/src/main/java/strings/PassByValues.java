package strings;

public class PassByValues {

    public static void main(String[] args) {

        String name = "rajith";
        changeName(name);
        System.out.println(name);

        StringBuilder name2 = new StringBuilder();

        changeNameByBuilder(name2);
        System.out.println(name2);



    }

    public static void changeName(String name) {
        name = "konara";
    }

    public static void changeNameByBuilder(StringBuilder name) {
        name.append("konara");
    }

}
