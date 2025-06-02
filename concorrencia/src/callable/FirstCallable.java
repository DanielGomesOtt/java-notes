package callable;

import java.util.concurrent.*;

//Callable é um Runnable com generics
class RandomNumberCallable implements Callable<String> {

    //call é tipo um run que retorna algo
    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa callable...%n", Thread.currentThread().getName(), num);
        }
        return String.format("%s finished and the random number is %d.%n", Thread.currentThread().getName(), num);
    }
}

public class FirstCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //executa o callable
        Future<String> future = executor.submit(randomNumberCallable);
        //espera o callable executar. sem isso a thread main executa antes do callable
        String s = future.get();
        System.out.printf("Program finished %s", s);
        executor.shutdown();
    }
}


