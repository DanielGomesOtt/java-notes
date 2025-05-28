package thread_local;

public class ThreadLocalTest {

    private static Integer counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //usando thread local, conseguimos tornar valores externos em valores locais da thread e evitar divergencias porque tem mais de uma thread acessando o mesmo valor
                //evita race condition, deadlocks e outros problemas.
                ThreadLocal<Integer> threadLocal1 = ThreadLocal.withInitial(() -> counter);
                for (int i = 0; i < 100; i++) {
                    threadLocal1.set(threadLocal1.get() + 1);
                }
                System.out.println("Valor thread 1");
                System.out.println(threadLocal1.get());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocal<Integer> threadLocal2 = ThreadLocal.withInitial(() -> counter);
                for (int i = 0; i < 100; i++) {
                    threadLocal2.set(threadLocal2.get() + 1);
                }
                System.out.println("Valor thread 2");
                System.out.println(threadLocal2.get());
            }
        });



        thread.start();
        thread2.start();

        //espera que a thread termine para continuar
        thread.join();
        thread2.join();

        //parecido com o join tambem temos o Thread.yield(), que da uma dica ao scheduler de processos
        //que a thread atual que liberar a memória por um momento. Nesse caso a thread volta de runing para runable
        System.out.println(counter);
    }
}
