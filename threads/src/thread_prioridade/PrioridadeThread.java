package thread_prioridade;

public class PrioridadeThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello thread");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello thread2");
            }
        });

        //para setar prioridade para um thread use o setpriority. Prioridade não quer dizer que a thread sempre será executada primeiro
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread2.start();
        System.out.println("Hello world");
    }
}
