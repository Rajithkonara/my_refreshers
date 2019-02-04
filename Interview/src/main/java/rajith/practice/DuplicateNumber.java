package rajith.practice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

    private int findDuplicateNumber(List<Integer> numbers) {

        int highestNumber = numbers.size() - 1;
        System.out.println("highestNumber ---> "+highestNumber);
        int total = getSum(numbers);
        System.out.println("total ---->" +total);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        System.out.println("duplicate ----->" + duplicate);
        return duplicate;
    }


    private int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<6;i++){
            numbers.add(i);
        }
        numbers.add(2);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }

}
