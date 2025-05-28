package wait_and_notifyAll;

public class Data {

    private boolean outOfSync;
    private int value;

    public boolean isOutOfSync() {
        return outOfSync;
    }

    public void setOutOfSync(boolean outOfSync) {
        this.outOfSync = outOfSync;
    }

    public int getValue() {
        return value;
    }

    public  void setValue(int value) {
        this.value = value;
    }

    //syncrhronized indica que 2 threads não podem acessar o mesmo metodo ao mesmo tempo
    //mesma coisa do bloco de código synchronized
    public synchronized void sync() throws InterruptedException {
        System.out.println("Synchronizing data...");
        if(!outOfSync) {
            this.wait();
        }

        outOfSync = false;
        Thread.sleep(5000);
        System.out.println("Synchronized");
        this.notifyAll();
    }

    public synchronized void read() throws InterruptedException {
        System.out.println("Reading data...");
        if (outOfSync) {
            this.wait();
        }

        Thread.sleep(2000);
        System.out.println("Data: " + value);

    }

}
