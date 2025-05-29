package atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count;
    //um inteiro que pode ser alterado atomicamente. perfeito para contagem de mais de uma thread ao mesmo tempo
    //com ele não precisamos de lock na função de incremento
    private AtomicInteger atomicInteger = new AtomicInteger();

    void increment () {
        //incremento normal
        count++;
        //incremento com atomic integer
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}


public class FirstAtomicInteger {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        //printando incremento normal, por estar sendo acesso por 2 threads, vai ficar dando diferença
        System.out.println(counter.getCount());
        //printando incremento via atomic integer. vai dar o valor certo
        System.out.println(counter.getAtomicInteger());
    }
}
