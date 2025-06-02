package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printers implements Runnable {

    @Override
    public void run() {
        System.out.printf("%s sendo executada.%n", Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s sendo finalizada.%n", Thread.currentThread().getName());
    }
}

public class FirstExecutor {

    public static void main(String[] args) {
        //aqui você escolhe um tamanho para o tanto de threads disponiveis
        //ExecutorService executorService = Executors.newFixedThreadPool(4);

        //aqui umsa thread fica responsavel por executar todas as tarefas executadas
        //ExecutorService executorService = Executors.newSingleThreadExecutor();

        //usa threads já diponiveis para executar ao inves de ficar criando novas
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new Printers());
        executorService.execute(new Printers());
        executorService.execute(new Printers());
        executorService.execute(new Printers());
        executorService.shutdown();

    }
}
