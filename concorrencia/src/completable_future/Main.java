package completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FirstCompletableFuture firstCompletableFuture = new FirstCompletableFuture();
        SupplyAsyncExample supplyAsyncExample = new SupplyAsyncExample();
        CompletableFuture.runAsync(() -> {
            System.out.println("Hello from completable future in the main");
        });
        //aqui nesse caso a main thread não está impedida pelo compeltable future, porque não tem uso do .get()
        for (int i = 0; i < 1; i++){
            System.out.println("Main thread executando agora");
            Thread.sleep(10000);
      ;  }
        try {
            supplyAsyncExample.run();
            firstCompletableFuture.run();
            System.out.println("Após o completable future");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
