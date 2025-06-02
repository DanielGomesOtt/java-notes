package reetrant_lock;

import java.util.concurrent.locks.ReentrantLock;

public class FirstLock {
    private static int count = 0;
    //tranca o acesso a variavel com lock e destranca com unlock, assim só a thread atual tem acesso.
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    for (int i = 0; i < 100; i++) {


                        FirstLock.count++;

                    }

                } finally {
                    System.out.println("Thread 1");
                    System.out.println(FirstLock.count);
                    FirstLock.count = 0;
                    lock.unlock();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    for (int i = 0; i < 100; i++) {


                        FirstLock.count++;

                    }

                } finally {
                    System.out.println("Thread 2");
                    System.out.println(FirstLock.count);
                    FirstLock.count = 0;
                    lock.unlock();
                }

            }
        });

        thread.start();
        thread2.start();

        //no reentrant lock para usar a casse wait, notify e notifyAll, você precisa usar a classe Condition e usar os seguintes métodos:
        // wait -> await
        // notify -> signal
        // notifyAll -> sigmalAll


    }
}
