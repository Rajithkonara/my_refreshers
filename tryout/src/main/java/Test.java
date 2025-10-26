import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Test {
    private static void setPerson(Person person) {
        person.name = "test";
    }
    public static int countDeletionsMap(String a, String b) {

        Map<String, Integer> m1 = getStringIntegerMap(a);
        Map<String, Integer> m2 = getStringIntegerMap(b);

        System.out.println(m1);
        System.out.println(m2);

        int deletions = 0;

        for (String c: m1.keySet()) {
            int fa = m1.get(c);
            System.out.println(fa);
            int fb = m2.getOrDefault(c, 0);

            deletions += Math.abs(fa-fb);
        }

        for (String c: m2.keySet()) {
            if (!m1.containsKey(c)) {
                deletions += m2.get(c);
            }
        }
        return deletions;
    }

    private static Map<String, Integer> getStringIntegerMap(String a) {
        Map<String, Integer> m1 = new HashMap<>();
        char[] chars = a.toCharArray();
        for (char c: chars) {
                m1.put(String.valueOf(c), m1.getOrDefault(String.valueOf(c),0)+1);
        }
        return m1;
    }
    public static int countDeletions(String a, String b) {

        int common = 0;

        List<Character> list = new ArrayList<>();
        char[] chars = a.toCharArray();
        for (char c: chars) {
            list.add(c);
        }

        char[] chars1  = b.toCharArray();

        for (char c1: chars1) {
            for (char c2: chars) {
                if (c1 == c2) {
                    common++;
                }
             }
        }

        return (a.length()+b.length()) - common;

    }


    public static boolean makeAnagram(String a, String b) {


        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();

        int counter = 0;
        int deleted = 0;

        if (s1.length == s2.length) {
            for (char c : s1) {
                for (char value : s2) {
                    if (c == value) {
                        counter++;
                        break;
                    } else {
                        deleted++;
                    }
                }
            }
            System.out.println(counter);
            System.out.println(deleted);
            return counter == s1.length;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

//        boolean b = makeAnagram("cde", "dcf");
//        int i = countDeletions("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
//        System.out.println(i);
//        System.out.println(b);

        int i = countDeletionsMap("cde", "abc");
        System.out.println(i);

        String a = "cdec";
        String b= "dcfcc";
        String aDub = a;
        String bDub = b;

        for (char letter : a.toCharArray()) {
            bDub = bDub.replaceFirst(String.valueOf(letter),"");
//            System.out.println(bDub);
        }
//        System.out.println(bDub);

        for (char letter : b.toCharArray()) {
            aDub = aDub.replaceFirst(String.valueOf(letter),"");
//            System.out.println(aDub);
        }
//        System.out.println(aDub);

        int i1 = aDub.length() + bDub.length();

//        System.out.println(i1);


    }

}

class Person {
    String name;
}

//    type person struct {
//    name string
//}
//    func main() {
//        p := person{"Richard"}
//        rename(p)
//        fmt.Println(p)
//    }
//    func rename(p person) {
//        p.name = "test"
//    }