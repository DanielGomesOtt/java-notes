package completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class SupplyAsyncExample {

    public void run () throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            int num = ThreadLocalRandom.current().nextInt(1, 11);
            return num;
        }).thenAccept((result) -> {//também temos o thenRun que é um callback que irá executar a ação seguida sem retornar nada
            System.out.printf("O resultado é %d%n", result);
        }).get();
    }
}
