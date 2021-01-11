package arrays;

// add new element to a string array
public class CopyArray {

    public static void main(String[] args) {

        String[] cars = {"A", "B", "C"};

        String newCar = "D";
        int currentSize = cars.length;
        int newSize = currentSize + 1;

        //create a temp array  of size 4
        String[] tmpArr = new String[newSize];
        for (int x = 0; x < currentSize; x++) {
            tmpArr[x] = cars[x];
        }

        tmpArr[newSize - 1] = newCar;
        cars = tmpArr;

        for (String element :
                cars) {
            System.out.println(element);
        }


        String str;
        Object nullValue = null;
        str = (String) nullValue;
        System.out.println(str);

    }

}
