package scheduled_executor_service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class FirstSchedule {

    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("beep");
        };

        //executa o runnable após o tempo de delay passado.
        //executor.schedule(r, 5, TimeUnit.SECONDS);

        //começa a executa o runnable passado após o delay inicial passado e volta a executar depois do tempo de delay passado
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);

        //schedule usada para parar o scheduleWithFixedDelay
        executor.schedule(() -> {
            System.out.println("Parando o schedule em delay");
            //cancelando schedule em delay
            scheduleWithFixedDelay.cancel(false);
            //dando shutdown
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);


    }


}
