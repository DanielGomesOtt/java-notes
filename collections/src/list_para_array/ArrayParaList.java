package list_para_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayParaList {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        List<Integer> arrayParaList = new ArrayList<>(Arrays.asList(nums));
        arrayParaList.add(4);

        System.out.println(arrayParaList);
    }
}
