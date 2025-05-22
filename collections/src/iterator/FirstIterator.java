package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FirstIterator {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Iterator<Integer> numsIterator = nums.iterator();

        while(numsIterator.hasNext()){
            Integer num = numsIterator.next();
            if (num % 2 == 0) {
                numsIterator.remove();
            }
        }

        //Está usando o iterator por baixo dos panos.
        //nums.removeIf(num -> num % 2 == 0);

        System.out.println(nums);
    }
}
