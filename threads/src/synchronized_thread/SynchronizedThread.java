package synchronized_thread;

public class SynchronizedThread implements Runnable{

    private int counter;

    @Override
    public void run() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + ": " + counter);
        }
    }
}
