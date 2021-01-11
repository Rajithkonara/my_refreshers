package eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by rajith on 10/18/18.
 */
public class Iterator {

    public static void main(String[] args) {

        //sample collection
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) myList.add(i);

        //traverse using iterator
        java.util.Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }

        //traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value::" + integer);
            }
        });

        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);


    }

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }


}