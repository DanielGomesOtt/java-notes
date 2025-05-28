package wait_and_notifyAll;

public class ThreadSync implements Runnable{

    private Data data;

    public ThreadSync(Data data) {
        super();
        this.data = data;
    }

    @Override
    public void run() {
        try {
            data.sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
