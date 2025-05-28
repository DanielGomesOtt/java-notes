package wait_and_notifyAll;

public class ThreadRead implements Runnable{

    private Data data;

    public ThreadRead(Data data) {
        super();
        this.data = data;
    }

    @Override
    public void run() {
        try {
            data.read();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
