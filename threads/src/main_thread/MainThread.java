package main_thread;

public class MainThread implements Runnable{
    private int counter;

    @Override
    public void run() {
        counter++;
        System.out.println(Thread.currentThread().getName() + ": " + counter);
    }
}
