package synchronized_thread_use;

import synchronized_thread.SynchronizedThread;

public class SynchronizedThreadUse {

    public static void main(String[] args) {

        //Aqui por estar usando o bloco synchronized na thread, as threads continuam não mantendo a ordem de execução, porém, agora uma precisa terminar a execução para outra começar a ser executada
        //Executa de forma sincrona
        SynchronizedThread task = new SynchronizedThread();

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
