package wildcards;

import java.util.List;

public class FirstWildcard {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        List<String> names = List.of("Daniel", "Emanuel", "Paula");

        printList(nums);
        printList(names);
    }

    //generic wildcard normal
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
