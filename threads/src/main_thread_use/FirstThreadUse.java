package main_thread_use;

import main_thread.MainThread;

public class FirstThreadUse {

    public static void main(String[] args) {

        //Essa thread está executando sem seguir uma ordem, pois todas estão executando ao mesmo tempo
        MainThread task = new MainThread();

        Thread counter1 = new Thread(task);
        Thread counter2 = new Thread(task);
        Thread counter3 = new Thread(task);
        Thread counter4 = new Thread(task);
        Thread counter5 = new Thread(task);


        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();
        counter5.start();

    }
}
