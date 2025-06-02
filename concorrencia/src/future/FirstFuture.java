package future;

import java.util.concurrent.*;

public class FirstFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //future é assincrono
        Future<Double> dollar = executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                TimeUnit.SECONDS.sleep(2);

                return 4.35D;
            }
        });
        System.out.println(doingSomething());
        //use get para pegar o resultado de future é tipo um async do javascript
        Double dollarRequest = dollar.get();
        System.out.println(dollarRequest);
        executorService.shutdown();
    }

    private static Long doingSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum+=i;
        }
        return sum;
    }
}
