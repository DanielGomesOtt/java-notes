package wait_and_notifyAll;

public class OnlineService {

    public static void main(String[] args) {
        Data data = new Data();

        data.setOutOfSync(true);
        Thread readData = new Thread(new ThreadRead(data));
        Thread syncData = new Thread(new ThreadSync(data));
        readData.start();
        syncData.start();
    }
}
