package reentrant_read_write_lock;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) throws InterruptedException {
        rwl.writeLock().lock();
        try {
            if(rwl.isWriteLocked()) {
                System.out.printf("%s obteve o WRITE LOCK%n", Thread.currentThread().getName());
                map.put(key, value);
                Thread.sleep(2000);
            }
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> allKeys() {
        rwl.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}


public class FirstReentrantReadWriteLock {

    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                try {
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable reader = () -> {
            if (rwl.isWriteLocked()) {
                System.out.println("Write Locked");
            }

            rwl.readLock().lock();
            System.out.println("FINALLY I GOT THE DAMN LOCK");

            try{
                System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
            } finally {
                rwl.readLock().unlock();
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);

        t1.start();
        t2.start();
        t3.start();

    }
}
