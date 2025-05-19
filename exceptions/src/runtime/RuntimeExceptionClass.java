package runtime;

public class RuntimeExceptionClass {

    //checked exceptions são tratadas em tempo de compilação e unchecked exceptions são tratadas em tempo de execução

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(nums[2]); //ArrayIndexOutOfBoundsException -> RuntimeException
    }
}
