package list_para_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListParaArray {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        Integer[] listParaArray = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(listParaArray));
    }
}
