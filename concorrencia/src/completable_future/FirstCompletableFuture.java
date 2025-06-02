package completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FirstCompletableFuture {

    //completable future é uma evolução do future. ele é basicamente programação assincrona.
    //pense no completable future como o async e o .get() dele como o await do javascript
    public void run() throws ExecutionException, InterruptedException {
        CompletableFuture.runAsync(() -> {
            System.out.println("Hello from completable future");
        }).get();
    }
}
