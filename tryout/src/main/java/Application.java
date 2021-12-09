import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    String input = "aaxyyzhxa";

    char[] chars = input.toCharArray();

    Arrays.sort(chars);

    String s = new String(chars);
    System.out.println(s);

    StringBuilder sb = new StringBuilder("hello");
    sb.deleteCharAt(0).insert(0, "H").append(" World!");
    System.out.println(sb);


    String[] array = {"abc", "43", "2", "0"};
    List<String> list = Arrays.asList(array);
    Collections.sort(list);
    System.out.println(Arrays.toString(array));

    char ch = 'a';

    System.out.println((long) ch);


    int[] arr = new int[4];

    arr[0] = arr[0]+ 1;

    System.out.println(arr);
  }

}
