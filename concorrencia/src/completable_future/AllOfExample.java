package completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AllOfExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture num1 = CompletableFuture.supplyAsync(() -> {
            return 1;
        });

        CompletableFuture num2 = CompletableFuture.supplyAsync(() -> {
            return 2;
        });

        CompletableFuture num3 = CompletableFuture.supplyAsync(() -> {
            return 3;
        });

        CompletableFuture num4 = CompletableFuture.supplyAsync(() -> {
            return 4;
        });
        CompletableFuture allNumbers = CompletableFuture.allOf(num1, num2, num3, num4);

        allNumbers.thenRun(() -> {
            try {
                System.out.println(num1.get());
                System.out.println(num2.get());
                System.out.println(num3.get());
                System.out.println(num4.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
