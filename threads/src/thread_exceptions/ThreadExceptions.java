package thread_exceptions;

public class ThreadExceptions {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello thread");
                //exceção de uma thread não afeta no funcionamento de outras threads
                throw new RuntimeException("Exceção da thread");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello thread2");
                throw new RuntimeException("Exceção da thread2");
            }
        });

        //tratamento de exceções de threads
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Erro corrigido");
            }
        });

        thread2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Erro2 corrigido");
            }
        });

        thread.start();
        thread2.start();
        System.out.println("Hello world");
    }
}
