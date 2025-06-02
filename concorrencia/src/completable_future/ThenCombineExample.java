package completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class ThenCombineExample {
//concatena o resultado de 2 completables futures
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            int num = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.println(num);
            return num;
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            int num2 = ThreadLocalRandom.current().nextInt(12, 21);
            System.out.println(num2);
            return num2;
        }), (num, num2) -> {
            System.out.println(num + num2);
            return num + num2;
        }).get();
    }
}
