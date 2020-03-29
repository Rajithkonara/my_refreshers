package arrays;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CopyArrayRefactored_test {

    private static final Logger logger = Logger.getLogger(CopyArray.class.getName());

    public static void main(String[] args) {

        String[] cars = {"A", "B", "C"};

        String newCar = "D";
        int currentSize = cars.length;
        int newSize = currentSize + 1;


        ArrayList<String> copy = new ArrayList<>();

        for (int i = 0; i < cars.length; i++) {
            copy.add(cars[i]);
        }

        copy.add(newCar);

        for (String element :
                copy) {
            System.out.println(element);
        }


        System.out.println("arrayList " + copy);

//        cars = copy.add(String.valueOf(cars));

        System.out.println(cars);


        //create a temp array  of size 4
        String[] tmpArr = new String[newSize];
        for (int x = 0; x < currentSize; x++) {
            tmpArr[x] = cars[x];
        }

        tmpArr[newSize - 1] = newCar;
        cars = tmpArr;

        for (String element :
                cars) {
//            System.out.println(element);
        }

    }

}

