package arrays;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("z");
        list.add("x");
        list.add(1, "y");
        list.add(0, "w");  //added to 0'th index


        System.out.println(list);

    }

}
